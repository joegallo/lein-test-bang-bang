# lein-test-bang-bang

Run your test namespaces in separate JVMs, so that you can tease out
if individual tests are depending on state from other test namespaces.

## Install
put this in your profiles.clj or project.clj

`:plugins [[lein-test-bang-bang "0.2.0"]]`

## Usage

lein 'test!!'

## License

Copyright (C) 2013 Joe Gallo

Distributed under the Eclipse Public License, the same as Clojure.
