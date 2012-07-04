(ns korma-lobos-tpl.server
  (:require [noir.server :as server]))

(server/load-views "src/korma_lobos_tpl/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'korma-lobos-tpl})))

