```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Exception caught: ${e.message}"
    // Handle the exception appropriately (e.g., log it, retry, etc.)
  } finally {
    println "Closure execution finished (with or without exception)"
  }
  println "After closure execution"
}

methodWithClosure { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong")
}

println "This line will be reached"
```