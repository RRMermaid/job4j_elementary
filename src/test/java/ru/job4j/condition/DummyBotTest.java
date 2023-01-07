package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static ru.job4j.condition.DummyBot.answer;

import ru.job4j.condition.DummyBot;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Hi, Bot.";
        String out = answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye.";
        String expected = "See you later.";
        String out = answer(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String expected = "I don't know. Please, ask another question.";
        String out = answer(in);
        assertThat(out).isEqualTo(expected);
    }
}