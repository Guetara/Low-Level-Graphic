# Low-Level-Graphic

Overview:

In this project I used Javaswing to create a simple graphic of a shopping bag inspired by the Notting Hill Shopping Bag.
You are able to click a button to peek at the items inside the bag and see some more simple graphics I made.

Technologies used:

JavaSwing is the primary technology used. I used a JFrame with ActionListener implemented as the framework. In this JFrame
I have a JPanel object where all the drawing takes place and a JButton which allows you to switch between drawings. The JButton
uses the ActionListener to perform tasks when the button is clicked. 

What I learned:

I learned a rudimentary way to in a way change the state of the canvas by using the button and a boolean in the JPanel. There
were only two states so it was simple just using one boolean to manage it and then using the repaint() function to change what
is displayed to the user. 

I learned a lot of the basics to create simple images by drawing lines or arcs, filling in rectangles or ovals, and also drawing
in text. From when I began working to when I finished I was much more profficient in understanding the placement of rectangles
and how even the ovals and arcs were confined within a rectangle and that helped me with placing those in the correct spaces.

In a way I also learned how to add more levels to my project. The initial idea I had was just to make the shopping bag. Then I
realized that is a very shallow and simple project especially once I realized I could use the drawString() function to make the
text for me. Then the idea came to me that I could add in a simple feature to look inside this bag and this allowed me to
be free to play around with a couple of different shapes and designs and get more comfortable with creating graphics. 

Lastly, one small thing I learned was simple manipulation of color as I wanted to make another green color a couple shades lighter than the one I already had and manipulated the RGB to reflect that by increasing each value by the same percentage.

Installation:

No installation required. Just have Java and an IDE to run it and you should be good.

Resources:

No third-party resoureces were used but as mentioned earlier the design for the bag is inspired by the Notting Hill Shopping bag
