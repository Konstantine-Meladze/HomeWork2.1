package org.example;


        abstract class VowelCounter {
            public abstract int countVowel(String input);
        }

        class VowelCounterImpl extends VowelCounter {
            @Override
            public int countVowel(String input) {
                if (input == null) {
                    return 0;
                }
                int count = 0;
                String vowels = "aeiouAEIOU";
                for (char c : input.toCharArray()) {
                    if (vowels.indexOf(c) != -1) {
                        count++;
                    }
                }
                return count;
            }
        }

        public class Main {
            public static void main(String[] args) {
                VowelCounterImpl vowelCounter = new VowelCounterImpl();

                // Example 1
                String input1 = "Hello";
                int count1 = vowelCounter.countVowel(input1);
                System.out.println("ამ სტრიქონში არის " + count1 + " ხმოვანი");


            }
        }

