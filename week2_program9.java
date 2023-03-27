

class week2_program9 {

   
        static void subString(char str[], int n) {
            // Pick starting point
            for (int len = 1; len <= n; len++) {
                // Pick ending point
                for (int i = 0; i <= n - len; i++) {
                    
                    int j = i + len - 1;
                    for (int k = i; k <= j; k++) {
                        System.out.print(str[k]);
                    }
    
                    System.out.println();
                }
            }
        }
    
        public static void main(String[] args) {
            char str[] = {'C','O','D','I','N','G'};
            subString(str, str.length);
    
        }
    }
    
    