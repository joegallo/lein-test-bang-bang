(ns sample.test.core
  (:use [sample.core] :reload)
  (:use [clojure.test]))

(deftest touched?-should-always-work
  (is (not @touched))
  (reset! touched true)
  (is @touched))
