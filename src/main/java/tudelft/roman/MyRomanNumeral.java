package tudelft.roman;

import java.util.HashMap;

public class MyRomanNumeral {


        private static HashMap<Character, Integer> romanConverterMap;

        static {
            romanConverterMap = new HashMap<Character, Integer>();

            romanConverterMap.put('I', 1);
            romanConverterMap.put('M', 100);
            romanConverterMap.put('D', 500);
            romanConverterMap.put('V', 5);
            romanConverterMap.put('C', 100);
            romanConverterMap.put('X', 10);
            romanConverterMap.put('L', 50);
        }

        public int convert(String s){

            int convertedNum = 0;

            for(int i = 0; i <s.length(); i++){
                int currentNumber = romanConverterMap.get(s.charAt(i));
                int next = i+1< s.length() ? romanConverterMap.get(s.charAt(i+1)): 0;

                if(currentNumber >= next){
                    convertedNum += currentNumber;
                }
                else {
                    convertedNum -= currentNumber;
                    }

            }
            return convertedNum;


        }

        }



