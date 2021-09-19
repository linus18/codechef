(ns codechef.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn atm [a b]
  (let [newBal (- b a 0.5)]
    (cond
      (and (= 0 (mod a 5)) (>= newBal 0)) newBal
      :else b)))

(defn qualprel [k n]
  (let [s (nth (vec (apply sorted-set-by > n)) (dec k))]
    (count (filter #(>= % s) n))))

(defn -main
  "Read from STDIN"
  [& args]
  (let [t (Integer/parseInt (read-line))]
    (loop [c 0]
      (if (= t c)
        ()
        (let [k (Integer/parseInt (second (str/split (read-line) #" ")))
              n (map #(Integer/parseInt %) (str/split (read-line) #" "))]
          (println (qualprel k n))
          (recur (inc c)))))))