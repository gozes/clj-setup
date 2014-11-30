(defproject {{name}} "0.0.1"
  :description "FIXME"
  :url "FIXME"

  :source-paths ["src" "src/{{name}}"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  
  :profiles{:repl {:plugins [[cider/cider-nrepl "0.8.1"]]}})

