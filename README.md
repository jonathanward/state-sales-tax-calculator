<div align="center">
  <h1>:money_with_wings: Java State Sales Tax Calculator :money_with_wings:</h1>
</div>
<br>
A Java program that calculates the state sales tax of prices based on user input. Development highlights include object-oriented programming, use of the command line interface and unit testing (JUnit).

## Sample Output

<details>
  <summary>Choosing a State</summary>
    <br>
    <p>(1) Set State</p>
    <p>(2) Calculate Tax</p>
    <p>(3) Exit</p>
    <p>Choose an option >>> <strong>1</strong></p>
    <p>Please enter the two-letter state abbreviation >>> <strong>TX</strong></p>
    <p>TX tax rate is 6.25%</p>
</details>


<details>
  <summary>Calculating Tax</summary>
    <br>
    <p>(1) Set State</p>
    <p>(2) Calculate Tax</p>
    <p>(3) Exit</p>
    <p>Current state: TX</p>
    <p>Choose an option >>> <strong>2</strong></p>
    <p>Please enter the price >>> <strong>9.99</strong></p>
    <p>Tax: $0.62</p>
    <p>Total: $10.61</p>
    <br>
    <p><em>Note: The program accepts whole numbers, decimals and dollar signs at the beginning of the price input.</em></p>
</details>

<details>
  <summary>Exception Handling</summary>
    <br>
    <ul>
      <li>Incorrect and/or unrecognized text will prompt a message: "**[USER INPUT]** is invalid. The user will be sent back to the main menu.</li>
      <li>The user must enter a state before calculating tax.</li>
    </ul>
</details>
