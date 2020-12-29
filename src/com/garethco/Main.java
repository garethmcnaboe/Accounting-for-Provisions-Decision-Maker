package com.garethco;

public class Main {

    public static void main(String[] args) {
        String probableOutFlow = "a";
        String reliableEstimate = "a";
        String possibleObligation = "a";
        String riskRemote = "a";
        String outFlowRemote = "a";

        //Questions (including order of questions)
        String presentObligation = Questions.presentObligationQ();

        if (presentObligation.equals("n"))
            possibleObligation = Questions.possibleObligationQ();

        if (presentObligation.equals("y"))
            probableOutFlow = Questions.probableOutflowQ();

        if ((presentObligation.equals("y")) && (probableOutFlow.equals("y")))
            reliableEstimate = Questions.reliableEstimatePossibleQ();

        if ((presentObligation.equals("y")) && (probableOutFlow.equals("n")))
            outFlowRemote = Questions.outFlowRemoteQ();

        if ((presentObligation.equals("n")) && (possibleObligation.equals("y")))
            riskRemote = Questions.riskRemoteQ();


    //Decision Making / Reporting
        if ((presentObligation.equals("y")) && (probableOutFlow.equals("y")) && (reliableEstimate.equals("y")))
            Report.makeProvision();

        if ((presentObligation.equals("y")) && (probableOutFlow.equals("y")) && (reliableEstimate.equals("n")))
            Report.makeDisclosure();

        if ((presentObligation.equals("n")) && (possibleObligation.equals("n")))
            Report.doNothing();

        if ((presentObligation.equals("y")) && (probableOutFlow.equals("n")) && (outFlowRemote.equals("n")))
            Report.doNothing();

        if ((presentObligation.equals("y")) && (probableOutFlow.equals("n")) && (outFlowRemote.equals("y")))
            Report.makeDisclosure();

        if ((presentObligation.equals("n")) && (possibleObligation.equals("y")) && (riskRemote.equals("y")))
            Report.doNothing();

        if ((presentObligation.equals("n")) && (possibleObligation.equals("y")) && (riskRemote.equals("n")))
            Report.makeDisclosure();
        }
    }