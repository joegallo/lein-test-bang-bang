(defproject lein-test-bang-bang "0.2.0-SNAPSHOT"
  :description "Run your test namespaces in separate JVMs"
  :dependencies [[bultitude "0.2.1" :exclusions [dynapath]]]
  :eval-in-leiningen true)
