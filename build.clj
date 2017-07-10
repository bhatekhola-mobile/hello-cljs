(require 'cljs.build.api)

(cljs.build.api/build "src" 
   {:main 'hello-cljs.core
    :output-to "out/main.js"})
