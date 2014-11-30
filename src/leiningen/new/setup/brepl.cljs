(ns cljs.brepl
  (:require [weasel.repl.websocket :as ws-repl]
            ([weasel.repl :as repl])))

(defn brepl-init []
  (cemerick.piggieback/cljs-repl :repl-env (ws-repl/repl-env :ip "127.0.0.1" :port 3000)))

(defn brepl-connect []
  (brepl-init)
  (repl/connect "ws://local:3000" :print #{:repl :console}))
