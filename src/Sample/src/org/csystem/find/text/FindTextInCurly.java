package org.csystem.find.text;

public class FindTextInCurly {
    public String text;
    public String result;
    public boolean isValid;

    public FindTextInCurly(String str)
    {
        text = str;
        result = text;
        isValid = true;
    }

    public void parse()
    {
        while (true) {
            int openIndex = result.indexOf('{');
            int closeIndex = result.lastIndexOf('}');

            if (openIndex == -1 && closeIndex != -1 || openIndex > closeIndex) {
                isValid = false;
                break;
            }

            if (closeIndex == -1)
                break;

            result = result.substring(openIndex + 1, closeIndex);
        }
    }
}
