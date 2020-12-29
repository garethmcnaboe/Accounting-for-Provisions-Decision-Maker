package com.garethco;

public class Questions {

    public static String presentObligationQ() {
        String presentObligation = Console.readAnswer("Is there a present obligation as a result of an obligating event? (y/n): ");
        return presentObligation;
    }

    public static String probableOutflowQ() {
        String probableOutflow = Console.readAnswer("Is there a probable outflow? (y/n): ");
        return probableOutflow;
    }

    public static String possibleObligationQ() {
        String possibleObligation = Console.readAnswer("Is there a possible obligation? (y/n): ");

        return possibleObligation;
    }

    public static String riskRemoteQ () {
        String riskRemote = Console.readAnswer("Is the risk of an obligation remote? (y/n): ");
        return riskRemote;
    }

    public static String outFlowRemoteQ () {
        String outFlowRemote = Console.readAnswer("Is the risk of an outflow remote? (y/n): ");
        return outFlowRemote;
    }

    public static String reliableEstimatePossibleQ() {
        String reliablEstimatePossible = Console.readAnswer("Can a reliable estimate be made of the outflow(y/n): ");
        return reliablEstimatePossible;
    }
}

