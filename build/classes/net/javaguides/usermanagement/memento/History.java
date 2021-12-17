package com.DesignPatternsLearning.memento;

import java.util.Stack;

public class History {
    Stack<EditorState> prevState = new Stack();

    public void push(EditorState State) {

        prevState.push(State);
    }

    public EditorState pop() {
        EditorState state = prevState.pop();
        return state;
    }
}
