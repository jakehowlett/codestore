//Regular base font
BaseFont bf = BaseFont.createFont("SourceSansPro-Regular.otf",
    BaseFont.WINANSI,
    BaseFont.EMBEDDED,
    false,
    getResourceAsByteArray("SourceSansPro-Regular.otf"),
    null);

//Bold base font
BaseFont bfb = BaseFont.createFont("SourceSansPro-Bold.otf",
    BaseFont.WINANSI,
    BaseFont.EMBEDDED,
    false,
    getResourceAsByteArray("SourceSansPro-Semibold.otf"),
    null);

//A collection of fonts (based upon our base fonts) for re-use throughout the code!
Font defaultFont = new Font(bf, 12);
Font headerFont = new Font(bfb, 18);
Font tinyFont = new Font(bf, 9);
Font tinyFontBoldAndWhite = new Font(bfb, 9, Font.NORMAL, Color.WHITE);