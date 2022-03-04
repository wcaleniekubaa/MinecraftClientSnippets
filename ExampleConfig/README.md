<h2>How to use that?</h2>
<h4>This is easy, You need arraylist of your mods (but thats easy)</h4>

```java
  // start method
  public void init() {
    // register your mods before
    mods.add(new Mod());
    
    try{
      ExampleConfig.load(); // you can change class name 
    }
    catch(IOException io){
      // do something
    }

  }
  
  // shutdown method
  public void shutdown() {
    try{
      ExampleConfig.save();
    } catch(IOException io) {
      // do something
    }
  }
```
