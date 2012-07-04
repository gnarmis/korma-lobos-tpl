(defproject korma-lobos-tpl "0.1.0-SNAPSHOT"
            :description "A template integrating Korma and Lobos"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [noir "1.2.1"]
                           [korma "0.3.0-beta7"]
                           [lobos "1.0.0-SNAPSHOT"]
                           [mysql/mysql-connector-java "5.1.6"]]
            :main korma-lobos-tpl.server)

