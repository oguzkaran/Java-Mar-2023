package org.csystem.app.commandprompt;

import org.csystem.util.string.StringUtil;

import java.util.Scanner;

public class CommandPrompt {
    public static String [] commands = {"length", "reverse", "upper", "lower", "change", "quit"};
    public String prompt;

    public static void doForLength(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.printf("%s command must have 1 argument%n", commandInfo[0]);
            return;
        }

        System.out.println(commandInfo[1].length());
    }

    public static void doForReverse(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.printf("%s command must have 1 argument%n", commandInfo[0]);
            return;
        }

        System.out.println(StringUtil.reverse(commandInfo[1]));
    }

    public static void doForUpper(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.printf("%s command must have 1 argument%n", commandInfo[0]);
            return;
        }

        System.out.println(commandInfo[1].toUpperCase());
    }

    public static void doForLower(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.printf("%s command must have 1 argument%n", commandInfo[0]);
            return;
        }

        System.out.println(commandInfo[1].toLowerCase());
    }

    public static void doForQuit(String [] commandInfo)
    {
        System.out.println("C and System Programmers Association");
        System.out.println("Thank you!...");
        System.exit(0);
    }

    public void doForChange(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.printf("%s command must have 1 argument%n", commandInfo[0]);
            return;
        }

        prompt = commandInfo[1];
    }

    public static String getCommand(String cmdText)
    {
        for (int i = 0; i < commands.length; ++i)
            if (commands[i].startsWith(cmdText))
                return commands[i];

        return "";
    }

    public void doForCommand(String [] commandInfo)
    {
        switch (commandInfo[0]) {
            case "length" -> doForLength(commandInfo);
            case "reverse" -> doForReverse(commandInfo);
            case "upper" -> doForUpper(commandInfo);
            case "lower" -> doForLower(commandInfo);
            case "change" -> doForChange(commandInfo);
            case "quit" -> doForQuit(commandInfo);
        }
    }

    public void doCommand(String [] commandInfo)
    {
        String command = getCommand(commandInfo[0]);

        if (!command.isEmpty()) {
            commandInfo[0] = command;
            doForCommand(commandInfo);
        }
        else
            System.out.println("Invalid command!...");
    }

    public void parseCommand(String [] commandInfo)
    {
        if (commandInfo[0].length() > 2)
            doCommand(commandInfo);
        else
            System.out.println("Command must have at least 3(three) characters!...");
    }

    public CommandPrompt(String p)
    {
        prompt = p;
    }

    public void run()
    {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print(prompt + ">");
            String command = kb.nextLine().strip();
            String [] commandInfo = command.split("[ \t]+");
            parseCommand(commandInfo);
        }


    }
}
