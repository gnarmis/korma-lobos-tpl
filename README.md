# korma-lobos-tpl

A template integrating Korma and Lobos.

## Usage

Create a MySQL db and provide details in src/korma_lobos_tpl/secret.clj in the form of dynamic bindings of all the required names used in lobos.config and korma-lobos-tpl.entities.connection.

```bash
lein deps
lein repl
```

Once in the REPL:
```clojure
(use 'lobos.core 'lobos.connectivity 'lobos.migration 'lobos.config 'lobos.migrations)
(open-global sqldb)
(migrate)
(use 'korma-lobos-tpl.entities.users)
(create-new-user "Aberforth")
```

## License

No Copyright.

Distributed under the Eclipse Public License, the same as Clojure.