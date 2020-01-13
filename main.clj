(defn count-down [n]
	(when-not (zero? n)
	(println "the value is: " n)
	(recur (dec n))))

(count-down 100)
