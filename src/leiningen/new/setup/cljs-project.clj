(defproject {{name}} "0.0.1"
  :description "FIXME"
  :url "FIXME"

  :source-paths ["src" "src/{{name}}"]]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/clojurescript "0.0-2197" :exclusions [org.apache.ant/ant]
                 [cljsbuild "1.0.3"]]

                 

                 
                 :profiles {:dev {:dependencies
                                  [com.cemerick/piggieback "0.1.3"]
                                  [weasel "0.4.2"]}
                            
                            :repl {:plugins [[cider/cider-nrepl "0.8.1"]]}
                            
                            :plugins [[lein-cljsbuild "1.0.3"]]
                            
                            :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]
                                           :init (require [cljs.brepl])}}

                 
                 :hooks [leiningen.cljsbuild]

                 :cljsbuild {:builds
                             {:dev
                              {:compiler {:source-paths ["src/cljs"]
                                          :output-to "resources/public/js/main.js"
                                          :optimizations :advanced}}}})

