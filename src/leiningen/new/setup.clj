(ns leiningen.new.setup
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "setup"))
  
  
(defn setup
  "Creates  project templates of different flavors."
  ([name]
   (www name :noop))
  ([name opts]
   (let [data {:name name
               :sanitized (name-to-path name)}
         clj  [["src/{{sanitized}}/core.clj" (render "setup/core.clj" data)] 
               ["project.clj" (render "setup/clj-project.clj" data)]]
         cljs  [["src/cljs/core.cljs" (render "core.cljs" data)]
                ["src/cljs/brepl.cljs" (render "brepl.cljs" data)]
                ["project.clj" (render "cljs-project.clj" data)]]]


     
     (apply ->files data
            (case opts
              "with-brepl" (concat base brepl)
              "with-om" (concat base brepl om)
              base)))))

    
  
  
