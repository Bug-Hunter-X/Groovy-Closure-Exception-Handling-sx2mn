# Groovy Closure Exception Handling
This example demonstrates a common issue in Groovy when exceptions are thrown within closures.  The exception thrown within the closure isn't caught by the calling method, resulting in the program's termination.

The `bug.groovy` file shows the problem. The `bugSolution.groovy` file presents a solution demonstrating how to properly handle exceptions thrown within closures.

## How to reproduce
1. Save the provided code as `bug.groovy`.
2. Run the script using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe that the program terminates abruptly after the exception in the closure, and "This line will not be reached" is not printed.

## Solution
The solution involves using a `try-catch` block within the method that calls the closure, effectively catching and handling exceptions originating from the closure.