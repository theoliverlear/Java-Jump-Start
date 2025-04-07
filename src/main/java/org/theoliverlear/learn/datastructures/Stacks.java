package org.theoliverlear.learn.datastructures;

import java.util.Stack;

public class Stacks {
    //===============================-Main-===================================
    public static void main(String[] args) {
        //---------------------Stack-The-Clothes------------------------------
        Stack<String> clothesPile = new Stack<>();
        clothesPile.push("Shirt");
        /*
         * |----------------|
         * |----------------|
         * |----------------|
         * |----------------|
         * |-----Shirt------|
         * |________________|
         */
        clothesPile.push("Pants");
        /*
         * |----------------|
         * |----------------|
         * |----------------|
         * |-----Pants------|
         * |-----Shirt------|
         * |________________|
         */
        clothesPile.push("Socks");
        /*
         * |----------------|
         * |----------------|
         * |-----Socks------|
         * |-----Pants------|
         * |-----Shirt------|
         * |________________|
         */
        clothesPile.push("Undershirt");
        /*
         * |----------------|
         * |---Undershirt---|
         * |-----Socks------|
         * |-----Pants------|
         * |-----Shirt------|
         * |________________|
         */
        clothesPile.push("Hat");
        /*
         * |------Hat-------|
         * |---Undershirt---|
         * |-----Socks------|
         * |-----Pants------|
         * |-----Shirt------|
         * |________________|
         */
        //--------------------Pull-Out-The-Clothes----------------------------
        while (!clothesPile.isEmpty()) {
            String item = clothesPile.pop();
            System.out.println("Taking out: " + item);
        }
    }
}
