(ns lobos.config
	(:use [lobos.connectivity]
     	  [lobos.core]
     	  [lobos.schema]
     	  [korma-lobos-tpl.secret]))

; define your database connection bindings in korma-lobos-tpl.secret

(def sqldb
  {:classname   "com.mysql.jdbc.Driver"
   :subprotocol "mysql"
   :subname     (str "//" *db-host* ":" *db-port* "/" *db-name*)
   :user *db-user*
   :password *db-password*})