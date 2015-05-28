(defproject aesh-clojure "0.1.1"
  :description "aesh-clojure"
  :url "https://github.com/aeshell/examples/tree/master/aesh-clojure"
  :dependencies [[org.clojure/clojure            "1.6.0" ]
                 [org.jboss.aesh/aesh            "0.59"]
                 [org.jboss.aesh/aesh-extensions "0.59"]]
  :main ^:skip-aot aesh-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
