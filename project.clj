(defproject lein-test-bang-bang "0.2.0"
  :description "Run your test namespaces in separate JVMs"
  :url "https://github.com/joegallo/lein-test-bang-bang/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[bultitude "0.2.1" :exclusions [dynapath]]]
  :eval-in-leiningen true)
