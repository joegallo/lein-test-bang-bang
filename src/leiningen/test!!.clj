(ns leiningen.test!!
  (:refer-clojure :exclude [test])
  (:use [bultitude.core :only [namespaces-in-dir]]
        [leiningen.core.eval :only [eval-in-project]]
        [leiningen.clean :only [clean]]
        [leiningen.deps :only [deps]]
        [leiningen.test :only [test *exit-after-tests*]]))

(defn test-nses [project]
  (sort (flatten (map namespaces-in-dir (:test-paths project)))))

(defn test!! [project]
  (doto project clean deps)
  (doseq [n (test-nses project)]
    (test project (str n))))
