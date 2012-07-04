(ns lobos.migrations
	(:refer-clojure :exclude [alter drop bigint boolean 
							  char double float time])
	(:use (lobos [migration :only [defmigration]] core schema)
		  [lobos.config]))

(defmigration create-users
  (up [] (create sqldb (table :users
							(varchar :username 100 :unique))))
  (down [] (drop sqldb (table :users))))

; causes this bug:
; IllegalArgumentException No implementation of method: :build-alter-statement 
; of protocol: #'lobos.schema/Alterable found for class: clojure.lang.
; PersistentArrayMap  clojure.core/-cache-protocol-fn (core_deftype.clj:495)
;
; (defmigration add-id-to-users
; 	(up [] (alter :add 
; 				  sqldb 
; 				  (table :users
; 						 (column :id))))
; 	(down [] (alter :drop
; 				  	sqldb 
; 				  	(table :users
; 						   (column :id)))))