/*
 * Copyright 2012 intesar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bia.ooyalaproject;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        MatrixDiagonalPrinter mdp = new MatrixDiagonalPrinter();
        
        char[][] m1 = {{'a', 'b', 'c'}, {'d','e','f'}, {'g','h','i'}};
        
        System.out.println("expected : ");
        System.out.println ("a, db, gec, hf, i");
        mdp.print(m1);
        System.out.println (mdp.getDiagonal(m1));
        
        System.out.println("-------- ");
        
        char[][] m2 = {{'a', 'b', 'c', 'd'}, {'e','f','g','h'}, {'i','j','k','l'}, {'m','n','o','p'}};
        System.out.println("expected : ");
        System.out.println ("a, eb, ifc, mjgd, nkh, ol, p");
        mdp.print(m2);
        
        char[][] m3 = {{'a', 'b', 'c', 'd'}, {'e','f','g','h'}, {'i','j','k','l'}};
        System.out.println("expected : ");
        System.out.println ("a, eb, ifc, jgd, kh, l");
        mdp.print(m2);
        
    }
}
