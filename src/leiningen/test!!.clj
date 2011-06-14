(ns leiningen.test!!
  (:refer-clojure :exclude [test])
  (:use [leiningen.util.ns :only [namespaces-in-dir]]
        [leiningen.compile :only [eval-in-project]]
        [leiningen.clean :only [clean]]
        [leiningen.deps :only [deps]]
        [leiningen.test :only [test *exit-after-tests*]]))

(defn test-nses [project]
  (sort (namespaces-in-dir (:test-path project))))

(defn test!! [project]
  (doto project clean deps)
  (doseq [n (test-nses project)]
    (test project (str n))))
