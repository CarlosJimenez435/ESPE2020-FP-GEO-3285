
package recursion.example;

class Recursion {
        public int Factorial(int parameter){
    if (parameter > 0){
    int num_calculated = parameter * Factorial(parameter-1);
          return num_calculated;
    }

    return 1;
        }
}
