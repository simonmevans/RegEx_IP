package com.company;

public class IP {
    private String IP;
    private Boolean error;
    private int points[];
    private String brokenIPPoints[];

    IP(String str) {
        IP = str;
        error = false;
        points = new int[4];
        brokenIPPoints = new String[4];
        getPoints();
        if (!error)
            checkPoints();
        if (!error)
            breakIP();
        if (!error)
            checkDigits();
        if(!error)
            checkBrokenIPPoints();
        result();
    }

    public void getPoints() {
        String str = IP;
        int index = 0;
        int pos = 0;
        int count = 0;
        while (index != -1) {
            index = str.indexOf('.', pos);
            pos = index + 1;
            if (index != -1 && count <= points.length) {
                points[count] = index;
                count++;
            }
        }
        for (int i = 0; i < points.length; i++) {
        }
    }

    public void checkPoints() {

        if (points[0] > 3 || points[0] < 1) {
            error = true;
//            System.out.println("!!! problem in check points first position");
        }
        if (points[3] != 0) {
            error = true;
//            System.out.println("!!! problem in check points end point");
        }
    }

    public void breakIP() {
        int start = 0;
        for (int i = 0; i < 4; i++) {

            if (i == 3) {
                brokenIPPoints[i] = IP.substring(start, IP.length());

            } else {
                brokenIPPoints[i] = IP.substring(start, points[i]);
                start = points[i] + 1;
            }

        }
    }

    public void checkDigits() {
        for (int i = 0; i < brokenIPPoints.length; i++) {
            for (int j = 0; j < brokenIPPoints[i].length(); j++) {
                if (!Character.isDigit(brokenIPPoints[i].charAt(j))) {
                    error = true;
                }
            }
        }
    }

    public void checkBrokenIPPoints() {
        int x = 0;
        for (int i = 0; i < brokenIPPoints.length; i++) {
            x = Integer.parseInt(brokenIPPoints[i]);
            if (x <=0 || x >255)
            {error = true;}
        }
    }
    public void result(){
        if(!error){
            System.out.println("Valid IP");
        }
        else
            System.out.println("Invalid IP");
    }

}

