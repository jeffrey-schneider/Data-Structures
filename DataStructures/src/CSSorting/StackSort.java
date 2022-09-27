/*
 * Copyright (C) 2021 JCSchneider
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package CSSorting;

import java.util.Stack;

/**
 *
 * @author JCSchneider
 */
public class StackSort {
    
    public void sort(Stack<Integer> s){
       int x=0;
        if(!s.isEmpty()){
            x=s.pop();
            sort(s);
            insert(s,x);
        }        
    }

    private void insert(Stack<Integer> s, int x) {
        if (!s.isEmpty() && s.peek() >=x) {
            int y = s.pop();
            insert(s,x);
            s.push(y);
        }else{
            s.push(x);
        }
    }
    
    public static void main(String[] args) {
        StackSort ss = new StackSort();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(30);
        stack.push(2);
        stack.push(66);
        stack.push(25);
        stack.push(13);
        
        ss.sort(stack);
        for (Integer val : stack) {
            System.out.println(val);
        }
    }
    
}
