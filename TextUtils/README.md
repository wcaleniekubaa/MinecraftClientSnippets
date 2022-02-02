<h1>TextUtils for drawing scaled string</h1>
 <h4>- allows easily drawing scaled string without gl knowledge lol <br></h4>
 <h4>- allows easily drawing centered scaled string <br></h4>
<h1>How to use this?</h1>

```java
  /**
   * Draw screen method in GuiScreen
   * draws buttons also ;)
   * @author wcaleniekubaa
   */
  @Override
  public void drawScreen(int mouseX, int mouseY, float partialTicks){
      /* 10,10 is x,y */
      
      /*
        Create TextUtils instance
      */
      TextUtils utils = new TextUtils(mc.fontRendererObj);
      /*
        Create not-disorted not-centered scaled string
       */
      utils.drawScaledString("Hello world!", 10,10, Color.white.getRgb(), 1.3f, true /* this boolean stands for dropping shadow not present in centered string */);
      /*
        Create disorted not-centered scaled string
      */
      utils.drawScaledString("Hello world!", 10,10, Color.white.getRgb(), 1.3f, 0.5f, true);
      
      /*
        Create not-disorted centered scaled string
       */
      utils.drawCenteredScaledString("Hello world!", 10,10, Color.white.getRgb(), 1.3f);
      /*
        Create disorted centered scaled string
      */
      utils.drawCenteredScaledString("Hello world!", 10,10, Color.white.getRgb(), 1.3f, 0.5f);
      
      super.drawScreen(mouseX, mouseY, partialTicks);
  }
```

<h4>Showcase: https://gyazo.com/bd05f5ccd431a67bd5bdf182e5d5ddda</h4>

<h5>plz credit me </h5>
