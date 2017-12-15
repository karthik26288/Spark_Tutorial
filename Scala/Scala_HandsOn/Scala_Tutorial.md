<div tabindex="-1" id="notebook" class="border-box-sizing">

<div class="container" id="notebook-container">

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [1]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">println</span><span class="o">(</span><span class="s">"Hello World"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hello World
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [2]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">lazy</span> <span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"Naga"</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[2]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg"><lazy></span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [3]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">name</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[3]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res2</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [4]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">// Scala Variables</span>
<span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"Naga"</span>
<span class="k">var</span> <span class="n">age</span> <span class="k">=</span> <span class="mi">30</span>
<span class="n">println</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">age</span><span class="o">)</span>
<span class="n">age</span> <span class="k">=</span> <span class="mi">40</span>
<span class="n">println</span><span class="o">(</span><span class="n">age</span><span class="o">)</span>
<span class="c1">//name = "Ravi"</span>
<span class="n">println</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Naga
30
40
Naga
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[4]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span>
<span class="ansi-cyan-fg">age</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">40</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [9]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="cm">/*</span>
<span class="cm">Scala control structures</span>
<span class="cm">*/</span>
<span class="k">val</span> <span class="n">age</span> <span class="k">=</span> <span class="mi">24</span>
<span class="k">if</span><span class="o">(</span> <span class="n">age</span> <span class="o"><</span> <span class="mi">21</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Not allowed to vote"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Allowed to Vote"</span><span class="o">)</span>
<span class="o">}</span>

<span class="c1">// Pattern Matching....</span>
 <span class="k">val</span> <span class="n">city</span> <span class="k">=</span> <span class="s">"Mysore"</span>
    <span class="n">city</span> <span class="k">match</span> <span class="o">{</span>
      <span class="k">case</span> <span class="s">"Bangalore"</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"It is capital city of Karnataka"</span><span class="o">)</span>
      <span class="k">case</span> <span class="s">"Chennai"</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"It is capital city of Tamilnadu"</span><span class="o">)</span>
      <span class="k">case</span> <span class="s">"Hyderabad"</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"It is capital city of Telangana"</span><span class="o">)</span>
      <span class="k">case</span> <span class="s">"Mumbai"</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"It is capital city of Maharastra"</span><span class="o">)</span>
      <span class="k">case</span> <span class="k">_</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"It is not a capital city"</span><span class="o">)</span>
    <span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Allowed to Vote
It is not a capital city
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[9]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">age</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">24</span>
<span class="ansi-cyan-fg">city</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Mysore"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [10]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Loops</span>
  <span class="k">var</span> <span class="n">num</span> <span class="k">=</span> <span class="mi">0</span><span class="o">;</span>
    <span class="k">while</span> <span class="o">(</span><span class="n">num</span> <span class="o"><</span> <span class="mi">10</span> <span class="o">&&</span> <span class="n">num</span> <span class="o">>=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span>
      <span class="n">println</span><span class="o">(</span><span class="n">num</span><span class="o">)</span>
      <span class="n">num</span> <span class="k">=</span> <span class="n">num</span> <span class="o">+</span> <span class="mi">1</span>
    <span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>0
1
2
3
4
5
6
7
8
9
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[10]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">num</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">10</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [12]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//For Loop</span>
<span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">1</span> <span class="n">to</span> <span class="mi">10</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">for</span> <span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">1</span> <span class="n">until</span> <span class="mi">10</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">nums</span> <span class="k">=</span> <span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">1</span> <span class="n">to</span> <span class="mi">10</span><span class="o">)</span> <span class="k">yield</span> <span class="n">i</span>

<span class="k">for</span><span class="o">(</span><span class="n">num</span> <span class="k"><-</span> <span class="n">nums</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">num</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>1
2
3
4
5
6
7
8
9
10
1
2
3
4
5
6
7
8
9
1
2
3
4
5
6
7
8
9
10
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[12]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">nums</span>: <span class="ansi-green-fg">collection</span>.<span class="ansi-green-fg">immutable</span>.<span class="ansi-green-fg">IndexedSeq</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Vector</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">7</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">9</span>, <span class="ansi-green-fg">10</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [13]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">1</span> <span class="n">to</span> <span class="mi">10</span> <span class="k">if</span> <span class="n">i</span> <span class="o">%</span> <span class="mi">2</span> <span class="o">==</span> <span class="mi">0</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>2
4
6
8
10
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [15]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">1</span> <span class="n">to</span> <span class="mi">10</span> <span class="n">by</span> <span class="mi">3</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>1
4
7
10
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [16]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Functions</span>
<span class="k">def</span> <span class="n">fact</span><span class="o">(</span><span class="n">n</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">if</span><span class="o">(</span><span class="n">n</span> <span class="o"><=</span> <span class="mi">1</span><span class="o">){</span>
        <span class="k">return</span> <span class="mi">1</span>
    <span class="o">}</span><span class="k">else</span><span class="o">{</span>
        <span class="k">return</span> <span class="n">n</span> <span class="o">*</span> <span class="n">fact</span><span class="o">(</span><span class="n">n</span> <span class="o">-</span> <span class="mi">1</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">factorial</span> <span class="k">=</span> <span class="n">fact</span><span class="o">(</span><span class="mi">6</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[16]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">fact</span>
<span class="ansi-cyan-fg">factorial</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">720</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [17]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">x</span> <span class="k">=</span> <span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=></span> <span class="n">a</span> <span class="o">+</span> <span class="mi">10</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[17]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">x</span>: <span class="ansi-green-fg">Int</span> => <span class="ansi-green-fg">Int</span> = <function1></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [18]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">x</span><span class="o">(</span><span class="mi">10</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[18]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res17</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">20</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [19]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">hai</span><span class="o">(){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Hai"</span><span class="o">)</span>
  <span class="o">}</span>

  <span class="k">def</span> <span class="n">hai</span><span class="o">(</span><span class="n">message</span><span class="k">:</span><span class="kt">String</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">message</span><span class="o">)</span>
  <span class="o">}</span>

  <span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">return</span> <span class="n">a</span> <span class="o">+</span> <span class="n">b</span>
  <span class="o">}</span>

  <span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">c</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span> <span class="o">+</span> <span class="n">c</span><span class="o">)</span>
  <span class="o">}</span>

  <span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Float</span><span class="o">,</span> <span class="n">c</span><span class="k">:</span><span class="kt">Double</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Double</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span> <span class="o">+</span> <span class="n">c</span><span class="o">)</span>
  <span class="o">}</span>

  <span class="k">def</span> <span class="n">welcomeMessage</span><span class="o">(</span><span class="n">message</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Unit</span> <span class="o">=</span> <span class="n">message</span> <span class="k">match</span> <span class="o">{</span>
    <span class="k">case</span> <span class="s">"scala"</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"Hai Welcome to Scala World"</span><span class="o">)</span>
    <span class="k">case</span> <span class="s">"java"</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"Hai Welcome to Java World"</span><span class="o">)</span>
    <span class="k">case</span> <span class="s">"python"</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"Hai Welcome to Python World"</span><span class="o">)</span>
    <span class="k">case</span> <span class="k">_</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"Hai Welcome to Programming World"</span><span class="o">)</span>
  <span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[19]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">hai</span>
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">hai</span>
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">welcomeMessage</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [20]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">hai</span><span class="o">()</span>
<span class="n">hai</span><span class="o">(</span><span class="s">"Welcome"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mi">20</span><span class="o">))</span>
<span class="n">println</span><span class="o">(</span><span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span><span class="mi">20</span><span class="o">,</span> <span class="mi">30</span><span class="o">))</span>
<span class="n">println</span><span class="o">(</span><span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span><span class="mf">20.10f</span><span class="o">,</span> <span class="mf">30.34</span><span class="o">))</span>
<span class="n">welcomeMessage</span><span class="o">(</span><span class="s">"python"</span><span class="o">)</span>
<span class="n">welcomeMessage</span><span class="o">(</span><span class="s">"scala"</span><span class="o">)</span>
<span class="n">welcomeMessage</span><span class="o">(</span><span class="s">"C"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hai
Welcome
30
60
60.44000038146973
Hai Welcome to Python World
Hai Welcome to Scala World
Hai Welcome to Programming World
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [21]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//With default values</span>
<span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="mi">10</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="mi">20</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[21]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [22]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">add</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[22]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res21</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">30</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [23]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">add</span><span class="o">(</span><span class="n">b</span><span class="k">=</span><span class="mi">30</span><span class="o">,</span> <span class="n">a</span><span class="k">=</span><span class="mi">40</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[23]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res22</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">70</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [25]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Higher Order Functions</span>
<span class="k">def</span> <span class="n">subAndAdd</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">f</span><span class="k">:</span><span class="o">(</span><span class="kt">Int</span><span class="o">,</span> <span class="kt">Int</span><span class="o">)</span> <span class="k">=></span> <span class="nc">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="n">f</span><span class="o">(</span><span class="n">a</span><span class="o">,</span> <span class="n">b</span><span class="o">)</span>
    <span class="k">val</span> <span class="n">sub</span> <span class="k">=</span> <span class="n">b</span> <span class="o">-</span> <span class="n">a</span>
    <span class="k">val</span> <span class="n">total</span> <span class="k">=</span> <span class="n">sum</span> <span class="o">+</span> <span class="n">sub</span>
    <span class="o">(</span><span class="n">total</span><span class="o">)</span>
<span class="o">}</span>
<span class="k">val</span> <span class="n">total</span> <span class="k">=</span> <span class="n">subAndAdd</span><span class="o">(</span><span class="mi">30</span><span class="o">,</span> <span class="mi">40</span><span class="o">,</span> <span class="n">add</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[25]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">subAndAdd</span>
<span class="ansi-cyan-fg">total</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">80</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [27]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span><span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=></span> <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
<span class="n">sum</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mi">20</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[27]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">sum</span>: (<span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>) => <span class="ansi-green-fg">Int</span> = <function2>
<span class="ansi-cyan-fg">res26_1</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">30</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [28]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="o">(</span><span class="k">_:</span><span class="kt">Int</span><span class="o">)</span> <span class="o">+</span> <span class="o">(</span><span class="k">_:</span><span class="kt">Int</span><span class="o">)</span>
<span class="n">sum</span><span class="o">(</span><span class="mi">20</span><span class="o">,</span> <span class="mi">30</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[28]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">sum</span>: (<span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>) => <span class="ansi-green-fg">Int</span> = <function2>
<span class="ansi-cyan-fg">res27_1</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">50</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [29]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span>
    <span class="o">+</span><span class="n">b</span><span class="o">)</span>
<span class="o">}</span>
<span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="n">add</span><span class="o">(</span><span class="mi">40</span><span class="o">,</span> <span class="mi">40</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[29]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
<span class="ansi-cyan-fg">sum</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">80</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [30]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Currying...</span>
<span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">)(</span><span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
<span class="o">}</span>
<span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">)(</span><span class="mi">30</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[30]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
<span class="ansi-cyan-fg">sum</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">40</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [31]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">adding</span> <span class="k">=</span> <span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">)</span><span class="k">_</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[31]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">adding</span>: <span class="ansi-green-fg">Int</span> => <span class="ansi-green-fg">Int</span> = <function1></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [32]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="n">adding</span><span class="o">(</span><span class="mi">40</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[32]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">sum</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">50</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [33]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Functions with variable lenth parameters</span>
<span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">nums</span><span class="k">:</span><span class="kt">Int*</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">var</span> <span class="n">sum</span> <span class="k">=</span> <span class="mi">0</span><span class="o">;</span>
    <span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="n">nums</span><span class="o">){</span>
        <span class="n">sum</span> <span class="k">=</span> <span class="n">sum</span> <span class="o">+</span> <span class="n">i</span>
    <span class="o">}</span>
    <span class="o">(</span><span class="n">sum</span><span class="o">)</span>
<span class="o">}</span>
<span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="n">add</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">5</span><span class="o">,</span><span class="mi">6</span><span class="o">,</span><span class="mi">7</span><span class="o">,</span><span class="mi">8</span><span class="o">,</span><span class="mi">9</span><span class="o">,</span><span class="mi">10</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[33]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
<span class="ansi-cyan-fg">sum</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">55</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [35]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">abstract</span> <span class="k">class</span> <span class="nc">Notify</span>
<span class="k">case</span> <span class="k">class</span> <span class="nc">Email</span><span class="o">(</span><span class="n">from</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">to</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">message</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">extends</span> <span class="nc">Notify</span>
<span class="k">case</span> <span class="k">class</span> <span class="nc">SMS</span><span class="o">(</span><span class="n">to</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">message</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">extends</span> <span class="nc">Notify</span>
<span class="k">case</span> <span class="k">class</span> <span class="nc">Alert</span><span class="o">(</span><span class="n">message</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">extends</span> <span class="nc">Notify</span>

<span class="k">def</span> <span class="n">sendNotification</span><span class="o">(</span><span class="n">notification</span><span class="k">:</span><span class="kt">Notify</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Unit</span> <span class="o">=</span> <span class="n">notification</span> <span class="k">match</span><span class="o">{</span>
    <span class="k">case</span> <span class="nc">Email</span><span class="o">(</span><span class="n">from</span><span class="o">,</span> <span class="n">to</span><span class="o">,</span> <span class="n">title</span><span class="o">)</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"You got a mail"</span><span class="o">)</span>
    <span class="k">case</span> <span class="nc">SMS</span><span class="o">(</span><span class="n">to</span><span class="o">,</span> <span class="n">msg</span><span class="o">)</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"You got an SMS"</span><span class="o">)</span>
    <span class="k">case</span> <span class="nc">Alert</span><span class="o">(</span><span class="n">msg</span><span class="o">)</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"You got an Alert"</span><span class="o">)</span>
    <span class="k">case</span> <span class="k">_</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"No Event"</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[35]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Notify</span>
defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Email</span>
defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">SMS</span>
defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Alert</span>
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">sendNotification</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [36]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">email</span> <span class="k">=</span> <span class="nc">Email</span><span class="o">(</span><span class="s">"abc@gmail.com"</span><span class="o">,</span> <span class="s">"xyz@gmail.com"</span><span class="o">,</span> <span class="s">"HI How are you?"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[36]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">email</span>: <span class="ansi-green-fg">Email</span> = <span class="ansi-yellow-fg">Email</span>(<span class="ansi-green-fg">"abc@gmail.com"</span>, <span class="ansi-green-fg">"xyz@gmail.com"</span>, <span class="ansi-green-fg">"HI How are you?"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [37]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">sendNotification</span><span class="o">(</span><span class="n">email</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>You got a mail
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [38]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Class constructors</span>

<span class="k">class</span> <span class="nc">Employee</span> <span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Employee"</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Employee
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[38]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span>
<span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">Employee</span> = $sess.cmd37Wrapper$Helper$Employee@42187502</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [39]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Employee</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">){</span>
 <span class="k">def</span> <span class="n">getName</span><span class="o">()</span><span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
  <span class="o">(</span><span class="n">name</span><span class="o">)</span>
 <span class="o">}</span>
 <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
  <span class="o">(</span><span class="n">age</span><span class="o">)</span>
 <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[39]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [40]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">,</span> <span class="mi">30</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getName</span><span class="o">())</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getAge</span><span class="o">())</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Naga
30
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[40]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">Employee</span> = $sess.cmd38Wrapper$Helper$Employee@6fc4224d</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [43]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Secondary or auxiliary Constructor</span>

<span class="k">class</span> <span class="nc">Employee</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">){</span>
 <span class="k">var</span> <span class="n">place</span> <span class="k">=</span> <span class="s">""</span>
 <span class="k">def</span> <span class="k">this</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">place</span><span class="k">:</span><span class="kt">String</span><span class="o">){</span>
     <span class="k">this</span><span class="o">(</span><span class="n">name</span><span class="o">,</span> <span class="n">age</span><span class="o">)</span>
     <span class="k">this</span><span class="o">.</span><span class="n">place</span> <span class="k">=</span> <span class="n">place</span>
 <span class="o">}</span>
 <span class="k">def</span> <span class="n">getName</span><span class="o">()</span><span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
  <span class="o">(</span><span class="n">name</span><span class="o">)</span>
 <span class="o">}</span>
 <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
  <span class="o">(</span><span class="n">age</span><span class="o">)</span>
 <span class="o">}</span>
 <span class="k">def</span> <span class="n">getPlace</span><span class="o">()</span><span class="k">:</span><span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
     <span class="o">(</span><span class="n">place</span><span class="o">)</span>
 <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[43]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [44]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">,</span> <span class="mi">30</span><span class="o">)</span>
<span class="k">val</span> <span class="n">employee</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">(</span><span class="s">"Ravi"</span><span class="o">,</span> <span class="mi">33</span><span class="o">,</span> <span class="s">"Mysore"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[44]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">Employee</span> = $sess.cmd42Wrapper$Helper$Employee@77d0a846
<span class="ansi-cyan-fg">employee</span>: <span class="ansi-green-fg">Employee</span> = $sess.cmd42Wrapper$Helper$Employee@1821134</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [45]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">emp</span><span class="o">.</span><span class="n">getName</span><span class="o">()</span>
<span class="n">employee</span><span class="o">.</span><span class="n">getPlace</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[45]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res44_0</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span>
<span class="ansi-cyan-fg">res44_1</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Mysore"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [47]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Maths</span><span class="o">{</span>
 <span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
 <span class="o">}</span>
 <span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">c</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span> <span class="o">+</span> <span class="n">c</span><span class="o">)</span>
 <span class="o">}</span>
 <span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Float</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Float</span> <span class="o">=</span> <span class="o">{</span>
     <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
 <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[47]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Maths</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [48]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">maths</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Maths</span><span class="o">()</span>
<span class="n">println</span><span class="o">(</span><span class="n">maths</span><span class="o">.</span><span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mi">20</span><span class="o">))</span>
<span class="n">println</span><span class="o">(</span><span class="n">maths</span><span class="o">.</span><span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mi">20</span><span class="o">,</span> <span class="mi">30</span><span class="o">))</span>
<span class="n">println</span><span class="o">(</span><span class="n">maths</span><span class="o">.</span><span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mf">30.20f</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>30
60
40.2
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[48]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">maths</span>: <span class="ansi-green-fg">Maths</span> = $sess.cmd46Wrapper$Helper$Maths@5fd247bb</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [49]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//this keyword</span>
<span class="k">class</span> <span class="nc">Employee</span><span class="o">{</span>
    <span class="k">var</span> <span class="n">name</span> <span class="k">=</span> <span class="s">""</span>
    <span class="k">var</span> <span class="n">age</span> <span class="k">=</span> <span class="mi">0</span>
    <span class="k">var</span> <span class="n">place</span> <span class="k">=</span> <span class="s">""</span>
    <span class="k">def</span> <span class="k">this</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">place</span><span class="k">:</span><span class="kt">String</span><span class="o">){</span>
        <span class="k">this</span><span class="o">()</span>
        <span class="k">this</span><span class="o">.</span><span class="n">name</span> <span class="k">=</span> <span class="n">name</span>
        <span class="k">this</span><span class="o">.</span><span class="n">age</span> <span class="k">=</span> <span class="n">age</span>
        <span class="k">this</span><span class="o">.</span><span class="n">place</span> <span class="k">=</span> <span class="n">place</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[49]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [51]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">,</span> <span class="mi">30</span><span class="o">,</span> <span class="s">"Mysore"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">place</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Naga
30
Mysore
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[51]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">Employee</span> = $sess.cmd48Wrapper$Helper$Employee@41b1d2b6</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [54]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Employee</span><span class="o">{</span>
    <span class="k">val</span> <span class="n">age</span> <span class="k">=</span> <span class="mi">30</span>
    <span class="k">def</span> <span class="n">message</span><span class="o">(){</span>

    <span class="o">}</span>
<span class="o">}</span>

<span class="k">class</span> <span class="nc">Programmer</span> <span class="k">extends</span> <span class="nc">Employee</span><span class="o">{</span>
    <span class="k">override</span> <span class="k">val</span> <span class="n">age</span> <span class="k">=</span> <span class="mi">40</span>
    <span class="k">override</span> <span class="k">def</span> <span class="n">message</span><span class="o">(){</span>
        <span class="n">println</span><span class="o">(</span><span class="s">"You are Programmer"</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">programmer</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Programmer</span><span class="o">()</span>
<span class="n">println</span><span class="o">(</span><span class="n">programmer</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
<span class="n">programmer</span><span class="o">.</span><span class="n">message</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>40
You are Programmer
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[54]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span>
defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Programmer</span>
<span class="ansi-cyan-fg">programmer</span>: <span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">Programmer</span> = $sess.cmd53Wrapper$Helper$Programmer@4d4eba6e</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [57]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Abstract Classes</span>
<span class="k">abstract</span> <span class="k">class</span> <span class="nc">Employee</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">getName</span><span class="o">()</span> <span class="k">:</span> <span class="kt">String</span>
    <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span> <span class="k">:</span><span class="kt">Int</span>
<span class="o">}</span>

<span class="k">class</span> <span class="nc">Manager</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">extends</span> <span class="nc">Employee</span> <span class="o">{</span>
    <span class="k">def</span> <span class="n">getName</span><span class="o">()</span> <span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="n">name</span><span class="o">)</span>
    <span class="o">}</span>
    <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
       <span class="o">(</span><span class="n">age</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[57]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span>
defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Manager</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [58]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">manager</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Manager</span><span class="o">(</span><span class="s">"Arjun"</span><span class="o">,</span> <span class="mi">35</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">manager</span><span class="o">.</span><span class="n">getName</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">manager</span><span class="o">.</span><span class="n">getAge</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Arjun
35
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[58]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">manager</span>: <span class="ansi-green-fg">Manager</span> = $sess.cmd56Wrapper$Helper$Manager@2fc43c9c</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [62]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">trait</span> <span class="nc">Shape</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">area</span><span class="o">(</span><span class="n">x</span><span class="k">:</span><span class="kt">Double</span><span class="o">,</span> <span class="n">y</span><span class="k">:</span><span class="kt">Double</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Double</span>
<span class="o">}</span>

<span class="k">trait</span> <span class="nc">Printable</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">printShape</span><span class="o">(</span><span class="n">shape</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">class</span> <span class="nc">Rectangle</span> <span class="k">extends</span> <span class="nc">Shape</span> <span class="k">with</span> <span class="nc">Printable</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">printShape</span><span class="o">(</span><span class="n">shape</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="o">{</span>
        <span class="n">println</span><span class="o">(</span><span class="s">"The shape type is: "</span> <span class="o">+</span> <span class="n">shape</span><span class="o">)</span>
    <span class="o">}</span>
    <span class="k">def</span> <span class="n">area</span><span class="o">(</span><span class="n">x</span><span class="k">:</span><span class="kt">Double</span><span class="o">,</span> <span class="n">y</span><span class="k">:</span><span class="kt">Double</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Double</span> <span class="o">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="n">x</span> <span class="o">*</span> <span class="n">y</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[62]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">trait</span> <span class="ansi-cyan-fg">Shape</span>
defined <span class="ansi-green-fg">trait</span> <span class="ansi-cyan-fg">Printable</span>
defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Rectangle</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [65]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">rectangle</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Rectangle</span><span class="o">()</span>
<span class="n">rectangle</span><span class="o">.</span><span class="n">printShape</span><span class="o">(</span><span class="s">"Rectangle"</span><span class="o">)</span>
<span class="k">val</span> <span class="n">area</span> <span class="k">=</span> <span class="n">rectangle</span><span class="o">.</span><span class="n">area</span><span class="o">(</span><span class="mf">10.0</span><span class="o">,</span> <span class="mf">20.0</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="s">"Area of rectangle is: "</span> <span class="o">+</span> <span class="n">area</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>The shape type is: Rectangle
Area of rectangle is: 200.0
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[65]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">rectangle</span>: <span class="ansi-green-fg">Rectangle</span> = $sess.cmd61Wrapper$Helper$Rectangle@4abebe44
<span class="ansi-cyan-fg">area</span>: <span class="ansi-green-fg">Double</span> = <span class="ansi-green-fg">200.0</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [66]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Arrays</span>
<span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Array</span><span class="o">[</span><span class="kt">Int</span><span class="o">](</span><span class="mi">10</span><span class="o">)</span>
<span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">0</span> <span class="n">until</span> <span class="mi">10</span><span class="o">){</span>
    <span class="n">numbers</span><span class="o">(</span><span class="n">i</span><span class="o">)</span> <span class="k">=</span> <span class="n">i</span>
<span class="o">}</span>

<span class="k">for</span><span class="o">(</span><span class="n">num</span> <span class="k"><-</span> <span class="n">numbers</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">num</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>0
1
2
3
4
5
6
7
8
9
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[66]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">7</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">9</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [67]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">matrix</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">.</span><span class="n">ofDim</span><span class="o">[</span><span class="kt">Int</span><span class="o">](</span><span class="mi">2</span><span class="o">,</span><span class="mi">2</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[67]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">matrix</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>]] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>), <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>))</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [69]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">matrix</span><span class="o">(</span><span class="mi">0</span><span class="o">)(</span><span class="mi">0</span><span class="o">)</span> <span class="k">=</span> <span class="mi">1</span>
<span class="n">matrix</span><span class="o">(</span><span class="mi">0</span><span class="o">)(</span><span class="mi">1</span><span class="o">)</span> <span class="k">=</span> <span class="mi">2</span>
<span class="n">matrix</span><span class="o">(</span><span class="mi">1</span><span class="o">)(</span><span class="mi">0</span><span class="o">)</span> <span class="k">=</span> <span class="mi">3</span>
<span class="n">matrix</span><span class="o">(</span><span class="mi">1</span><span class="o">)(</span><span class="mi">1</span><span class="o">)</span> <span class="k">=</span> <span class="mi">4</span>

<span class="n">println</span><span class="o">(</span><span class="n">matrix</span><span class="o">(</span><span class="mi">1</span><span class="o">)(</span><span class="mi">1</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>4
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [70]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">persons</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">(</span><span class="nc">Array</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">,</span> <span class="s">"Ravi"</span><span class="o">),</span> <span class="nc">Array</span><span class="o">(</span><span class="mi">30</span><span class="o">,</span> <span class="mi">33</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[70]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">persons</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">_96</span>] forSome { type <span class="ansi-green-fg">_96</span> >: <span class="ansi-green-fg">Int</span> with <span class="ansi-green-fg">String</span> }] = <span class="ansi-yellow-fg">Array</span>([Ljava.lang.String;@43c18401, [I@706f187e)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [73]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">println</span><span class="o">(</span><span class="n">persons</span><span class="o">(</span><span class="mi">0</span><span class="o">)(</span><span class="mi">0</span><span class="o">))</span>
<span class="n">println</span><span class="o">(</span><span class="n">persons</span><span class="o">(</span><span class="mi">0</span><span class="o">)(</span><span class="mi">1</span><span class="o">))</span>
<span class="n">println</span><span class="o">(</span><span class="n">persons</span><span class="o">(</span><span class="mi">1</span><span class="o">)(</span><span class="mi">0</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Naga
Ravi
30
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [78]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">// Scala Strings</span>
<span class="k">val</span> <span class="n">firstName</span> <span class="k">=</span> <span class="s">"Arjun"</span>
<span class="k">val</span> <span class="n">surName</span> <span class="k">=</span> <span class="s">" A"</span>
<span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="n">firstName</span> <span class="o">+</span> <span class="s">""</span> <span class="o">+</span> <span class="n">surName</span>
<span class="k">val</span> <span class="n">fullName</span> <span class="k">=</span> <span class="n">firstName</span><span class="o">.</span><span class="n">concat</span><span class="o">(</span><span class="n">surName</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">fullName</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Arjun A
ArjunA
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[78]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">firstName</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Arjun"</span>
<span class="ansi-cyan-fg">surName</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"A"</span>
<span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Arjun A"</span>
<span class="ansi-cyan-fg">fullName</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"ArjunA"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [76]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"Naga"</span>
<span class="k">val</span> <span class="n">name1</span> <span class="k">=</span> <span class="s">"Naga"</span>
<span class="k">if</span><span class="o">(</span><span class="n">name</span> <span class="o">==</span> <span class="n">name1</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Equal"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Not Equal"</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">if</span><span class="o">(</span><span class="n">name</span><span class="o">.</span><span class="n">equals</span><span class="o">(</span><span class="n">name1</span><span class="o">)){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Equal"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Not Equal"</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Equal
Equal
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[76]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span>
<span class="ansi-cyan-fg">name1</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [77]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">String</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">)</span>
<span class="k">val</span> <span class="n">name1</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">String</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">)</span>

<span class="k">if</span><span class="o">(</span><span class="n">name</span> <span class="o">==</span> <span class="n">name1</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Equal"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Not Equal"</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Equal
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[77]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span>
<span class="ansi-cyan-fg">name1</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [79]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"Naga"</span>
<span class="n">println</span><span class="o">(</span><span class="s">"Name: "</span> <span class="o">+</span> <span class="n">name</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="s">s"Name:</span> <span class="si">$name</span><span class="s">"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Name: Naga
Name: Naga
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[79]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [80]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">var</span> <span class="n">message</span> <span class="k">=</span> <span class="s">raw"naga\t30\tbangalore\n"</span>
<span class="n">println</span><span class="o">(</span><span class="n">message</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>naga\t30\tbangalore\n
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[80]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">message</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"""
naga\t30\tbangalore\n
"""</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [81]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Maths</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">divide</span><span class="o">(</span><span class="n">nums</span><span class="k">:</span><span class="kt">Array</span><span class="o">[</span><span class="kt">Int</span><span class="o">]){</span>
        <span class="k">for</span><span class="o">(</span><span class="n">num</span> <span class="k"><-</span> <span class="n">nums</span><span class="o">){</span>
            <span class="k">val</span> <span class="n">division</span> <span class="k">=</span> <span class="mi">100</span> <span class="o">/</span> <span class="n">num</span>
            <span class="n">println</span><span class="o">(</span><span class="n">division</span><span class="o">)</span>
        <span class="o">}</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">math</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Maths</span><span class="o">()</span>
<span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">5</span><span class="o">,</span><span class="mi">0</span><span class="o">,</span><span class="mi">6</span><span class="o">,</span><span class="mi">7</span><span class="o">,</span><span class="mi">8</span><span class="o">,</span><span class="mi">9</span><span class="o">)</span>
<span class="n">math</span><span class="o">.</span><span class="n">divide</span><span class="o">(</span><span class="n">numbers</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>100
50
33
25
20
</pre>

</div>

</div>

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre><span class="ansi-red-fg">java.lang.ArithmeticException: / by zero</span>
  $sess.cmd80Wrapper$Helper$Maths$anonfun$divide$1.apply$mcVI$sp(<span class="ansi-green-fg">cmd80.sc</span>:<span class="ansi-green-fg">4</span>)
  $sess.cmd80Wrapper$Helper$Maths$anonfun$divide$1.apply(<span class="ansi-green-fg">cmd80.sc</span>:<span class="ansi-green-fg">3</span>)
  $sess.cmd80Wrapper$Helper$Maths$anonfun$divide$1.apply(<span class="ansi-green-fg">cmd80.sc</span>:<span class="ansi-green-fg">3</span>)
  scala.collection.IndexedSeqOptimized$class.foreach(<span class="ansi-green-fg">IndexedSeqOptimized.scala</span>:<span class="ansi-green-fg">33</span>)
  scala.collection.mutable.ArrayOps$ofInt.foreach(<span class="ansi-green-fg">ArrayOps.scala</span>:<span class="ansi-green-fg">234</span>)
  $sess.cmd80Wrapper$Helper$Maths.divide(<span class="ansi-green-fg">cmd80.sc</span>:<span class="ansi-green-fg">3</span>)
  $sess.cmd80Wrapper$Helper.<init>(<span class="ansi-green-fg">cmd80.sc</span>:<span class="ansi-green-fg">12</span>)
  $sess.cmd80Wrapper.<init>(<span class="ansi-green-fg">cmd80.sc</span>:<span class="ansi-green-fg">733</span>)
  $sess.cmd80$.<init>(<span class="ansi-green-fg">cmd80.sc</span>:<span class="ansi-green-fg">383</span>)
  $sess.cmd80$.<clinit>(<span class="ansi-green-fg">cmd80.sc</span>:<span class="ansi-green-fg">-1</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [84]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Maths</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">divide</span><span class="o">(</span><span class="n">nums</span><span class="k">:</span><span class="kt">Array</span><span class="o">[</span><span class="kt">Int</span><span class="o">]){</span>
          <span class="k">for</span><span class="o">(</span><span class="n">num</span> <span class="k"><-</span> <span class="n">nums</span><span class="o">){</span>
            <span class="k">try</span><span class="o">{</span>
            <span class="k">val</span> <span class="n">division</span> <span class="k">=</span> <span class="mi">100</span> <span class="o">/</span> <span class="n">num</span>
            <span class="n">println</span><span class="o">(</span><span class="n">division</span><span class="o">)</span>
            <span class="o">}</span><span class="k">catch</span><span class="o">{</span>
            <span class="k">case</span> <span class="n">ae</span><span class="k">:</span><span class="kt">ArithmeticException</span> <span class="o">=></span> <span class="n">println</span><span class="o">(</span><span class="n">ae</span><span class="o">.</span><span class="n">getMessage</span><span class="o">())</span>
            <span class="o">}</span>  
        <span class="o">}</span>  
        <span class="o">}</span>   
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">math</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Maths</span><span class="o">()</span>
<span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">5</span><span class="o">,</span><span class="mi">0</span><span class="o">,</span><span class="mi">6</span><span class="o">,</span><span class="mi">7</span><span class="o">,</span><span class="mi">8</span><span class="o">,</span><span class="mi">9</span><span class="o">)</span>
<span class="n">math</span><span class="o">.</span><span class="n">divide</span><span class="o">(</span><span class="n">numbers</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>100
Finaly block always executes
50
Finaly block always executes
33
Finaly block always executes
25
Finaly block always executes
20
Finaly block always executes
/ by zero
Finaly block always executes
16
Finaly block always executes
14
Finaly block always executes
12
Finaly block always executes
11
Finaly block always executes
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[84]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Maths</span>
<span class="ansi-cyan-fg">math</span>: <span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">Maths</span> = $sess.cmd83Wrapper$Helper$Maths@609df808
<span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">7</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">9</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [86]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Vote</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">validate</span><span class="o">(</span><span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">){</span>
        <span class="k">if</span><span class="o">(</span><span class="n">age</span> <span class="o"><=</span> <span class="mi">18</span><span class="o">){</span>
            <span class="k">throw</span> <span class="k">new</span> <span class="nc">ArithmeticException</span><span class="o">(</span><span class="s">"You are not eligible for voting!"</span><span class="o">)</span>
        <span class="o">}</span><span class="k">else</span><span class="o">{</span>
            <span class="n">println</span><span class="o">(</span><span class="s">"You are eligible for voting!"</span><span class="o">)</span>
        <span class="o">}</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">vote</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Vote</span><span class="o">()</span>
<span class="n">vote</span><span class="o">.</span><span class="n">validate</span><span class="o">(</span><span class="mi">12</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre><span class="ansi-red-fg">java.lang.ArithmeticException: You are not eligible for voting!</span>
  $sess.cmd85Wrapper$Helper$Vote.validate(<span class="ansi-green-fg">cmd85.sc</span>:<span class="ansi-green-fg">4</span>)
  $sess.cmd85Wrapper$Helper.<init>(<span class="ansi-green-fg">cmd85.sc</span>:<span class="ansi-green-fg">12</span>)
  $sess.cmd85Wrapper.<init>(<span class="ansi-green-fg">cmd85.sc</span>:<span class="ansi-green-fg">761</span>)
  $sess.cmd85$.<init>(<span class="ansi-green-fg">cmd85.sc</span>:<span class="ansi-green-fg">399</span>)
  $sess.cmd85$.<clinit>(<span class="ansi-green-fg">cmd85.sc</span>:<span class="ansi-green-fg">-1</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [89]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">StrToNum</span><span class="o">{</span>
    <span class="nd">@throws</span><span class="o">(</span><span class="n">classOf</span><span class="o">[</span><span class="kt">NumberFormatException</span><span class="o">])</span>
    <span class="k">def</span> <span class="n">strToNum</span><span class="o">(</span><span class="n">number</span><span class="k">:</span><span class="kt">String</span><span class="o">){</span>
        <span class="k">val</span> <span class="n">num</span><span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="n">number</span><span class="o">.</span><span class="n">toInt</span>
        <span class="n">println</span><span class="o">(</span><span class="n">num</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
<span class="k">val</span> <span class="n">sn</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">StrToNum</span><span class="o">()</span>
<span class="n">sn</span><span class="o">.</span><span class="n">strToNum</span><span class="o">(</span><span class="s">"ABC"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre><span class="ansi-red-fg">java.lang.NumberFormatException: For input string: "ABC"</span>
  java.lang.NumberFormatException.forInputString(<span class="ansi-green-fg">NumberFormatException.java</span>:<span class="ansi-green-fg">65</span>)
  java.lang.Integer.parseInt(<span class="ansi-green-fg">Integer.java</span>:<span class="ansi-green-fg">580</span>)
  java.lang.Integer.parseInt(<span class="ansi-green-fg">Integer.java</span>:<span class="ansi-green-fg">615</span>)
  scala.collection.immutable.StringLike$class.toInt(<span class="ansi-green-fg">StringLike.scala</span>:<span class="ansi-green-fg">273</span>)
  scala.collection.immutable.StringOps.toInt(<span class="ansi-green-fg">StringOps.scala</span>:<span class="ansi-green-fg">29</span>)
  $sess.cmd88Wrapper$Helper$StrToNum.strToNum(<span class="ansi-green-fg">cmd88.sc</span>:<span class="ansi-green-fg">4</span>)
  $sess.cmd88Wrapper$Helper.<init>(<span class="ansi-green-fg">cmd88.sc</span>:<span class="ansi-green-fg">9</span>)
  $sess.cmd88Wrapper.<init>(<span class="ansi-green-fg">cmd88.sc</span>:<span class="ansi-green-fg">773</span>)
  $sess.cmd88$.<init>(<span class="ansi-green-fg">cmd88.sc</span>:<span class="ansi-green-fg">405</span>)
  $sess.cmd88$.<clinit>(<span class="ansi-green-fg">cmd88.sc</span>:<span class="ansi-green-fg">-1</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [91]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Collections</span>
<span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">(</span><span class="s">"naga"</span><span class="o">,</span> <span class="s">"ravi"</span><span class="o">,</span> <span class="s">"hari"</span><span class="o">,</span> <span class="s">"ravi"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[91]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"naga"</span>, <span class="ansi-green-fg">"ravi"</span>, <span class="ansi-green-fg">"hari"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [92]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//merge two sets</span>
<span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">(</span><span class="s">"naga"</span><span class="o">,</span> <span class="s">"ravi"</span><span class="o">,</span> <span class="s">"hari"</span><span class="o">,</span> <span class="s">"ravi"</span><span class="o">)</span>
<span class="k">val</span> <span class="n">names1</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">(</span><span class="s">"kiran"</span><span class="o">,</span> <span class="s">"kishore"</span><span class="o">,</span> <span class="s">"ashok"</span><span class="o">,</span> <span class="s">"amit"</span><span class="o">)</span>
<span class="k">val</span> <span class="n">namesList</span> <span class="k">=</span> <span class="n">names</span> <span class="o">++</span> <span class="n">names1</span>
<span class="n">namesList</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[92]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names1</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"kiran"</span>, <span class="ansi-green-fg">"kishore"</span>, <span class="ansi-green-fg">"ashok"</span>, <span class="ansi-green-fg">"amit"</span>)
<span class="ansi-cyan-fg">namesList</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"kiran"</span>, <span class="ansi-green-fg">"ravi"</span>, <span class="ansi-green-fg">"naga"</span>, <span class="ansi-green-fg">"amit"</span>, <span class="ansi-green-fg">"kishore"</span>, <span class="ansi-green-fg">"ashok"</span>, <span class="ansi-green-fg">"hari"</span>)
<span class="ansi-cyan-fg">res91_2</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"kiran"</span>, <span class="ansi-green-fg">"ravi"</span>, <span class="ansi-green-fg">"naga"</span>, <span class="ansi-green-fg">"amit"</span>, <span class="ansi-green-fg">"kishore"</span>, <span class="ansi-green-fg">"ashok"</span>, <span class="ansi-green-fg">"hari"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [95]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Adding and removing elements</span>
<span class="k">var</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">(</span><span class="s">"naga"</span><span class="o">,</span> <span class="s">"ravi"</span><span class="o">,</span> <span class="s">"hari"</span><span class="o">,</span> <span class="s">"ravi"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">names</span><span class="o">)</span>
<span class="n">names</span> <span class="o">+=</span> <span class="s">"siva"</span>
<span class="n">println</span><span class="o">(</span><span class="n">names</span><span class="o">)</span>
<span class="n">names</span> <span class="o">-=</span> <span class="s">"ravi"</span>
<span class="n">println</span><span class="o">(</span><span class="n">names</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Set(naga, ravi, hari)
Set(naga, ravi, hari, siva)
Set(naga, hari, siva)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[95]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"naga"</span>, <span class="ansi-green-fg">"hari"</span>, <span class="ansi-green-fg">"siva"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [96]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Iterating over sets</span>
<span class="k">for</span><span class="o">(</span><span class="n">name</span> <span class="k"><-</span> <span class="n">names</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>naga
hari
siva
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [97]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">names</span><span class="o">.</span><span class="n">foreach</span><span class="o">(</span><span class="n">item</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="n">item</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>naga
hari
siva
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [98]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//set operations</span>
<span class="k">val</span> <span class="n">A</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">(</span><span class="s">"a"</span><span class="o">,</span> <span class="s">"b"</span><span class="o">,</span> <span class="s">"c"</span><span class="o">,</span> <span class="s">"d"</span><span class="o">)</span>
<span class="k">val</span> <span class="n">B</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">(</span><span class="s">"c"</span><span class="o">,</span> <span class="s">"d"</span><span class="o">,</span> <span class="s">"e"</span><span class="o">,</span> <span class="s">"f"</span><span class="o">)</span>

<span class="k">val</span> <span class="n">intersection</span> <span class="k">=</span> <span class="n">A</span><span class="o">.</span><span class="n">intersect</span><span class="o">(</span><span class="n">B</span><span class="o">)</span>
<span class="k">val</span> <span class="n">union</span> <span class="k">=</span> <span class="n">A</span><span class="o">.</span><span class="n">union</span><span class="o">(</span><span class="n">B</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">intersection</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">union</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Set(c, d)
Set(e, f, a, b, c, d)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[98]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">A</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"a"</span>, <span class="ansi-green-fg">"b"</span>, <span class="ansi-green-fg">"c"</span>, <span class="ansi-green-fg">"d"</span>)
<span class="ansi-cyan-fg">B</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"c"</span>, <span class="ansi-green-fg">"d"</span>, <span class="ansi-green-fg">"e"</span>, <span class="ansi-green-fg">"f"</span>)
<span class="ansi-cyan-fg">intersection</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"c"</span>, <span class="ansi-green-fg">"d"</span>)
<span class="ansi-cyan-fg">union</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"e"</span>, <span class="ansi-green-fg">"f"</span>, <span class="ansi-green-fg">"a"</span>, <span class="ansi-green-fg">"b"</span>, <span class="ansi-green-fg">"c"</span>, <span class="ansi-green-fg">"d"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [99]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Sorted Set</span>
<span class="k">import</span> <span class="nn">scala.collection.immutable.SortedSet</span>

<span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">SortedSet</span><span class="o">(</span><span class="mi">2</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">1</span><span class="o">,</span><span class="mi">6</span><span class="o">,</span><span class="mi">5</span><span class="o">,</span><span class="mi">7</span><span class="o">,</span><span class="mi">9</span><span class="o">,</span><span class="mi">8</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">numbers</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>TreeSet(1, 2, 3, 4, 5, 6, 7, 8, 9)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[99]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.collection.immutable.SortedSet</span> 
<span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">collection</span>.<span class="ansi-green-fg">immutable</span>.<span class="ansi-green-fg">SortedSet</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">TreeSet</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">7</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">9</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [103]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">scala.collection.mutable.Set</span>

<span class="k">val</span> <span class="n">names</span><span class="k">:</span><span class="kt">Set</span><span class="o">[</span><span class="kt">String</span><span class="o">]</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">()</span>
<span class="n">println</span><span class="o">(</span><span class="n">names</span><span class="o">)</span>

<span class="n">names</span> <span class="o">+=</span> <span class="s">"Naga"</span>
<span class="n">println</span><span class="o">(</span><span class="n">names</span><span class="o">)</span>
<span class="n">names</span> <span class="o">+=</span> <span class="s">"Ravi"</span>
<span class="n">println</span><span class="o">(</span><span class="n">names</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Set()
Set(Naga)
Set(Naga, Ravi)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[103]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.collection.mutable.Set</span> 
<span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"Naga"</span>, <span class="ansi-green-fg">"Ravi"</span>)
<span class="ansi-cyan-fg">res102_3</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"Naga"</span>, <span class="ansi-green-fg">"Ravi"</span>)
<span class="ansi-cyan-fg">res102_5</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"Naga"</span>, <span class="ansi-green-fg">"Ravi"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [104]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="s">"ravi"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[104]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">"ravi"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [104]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">names</span> <span class="o">+=</span> <span class="s">"Ravi"</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stderr output_text">

<pre>cmd104.sc:1: value += is not a member of List[String]
  Expression does not convert to assignment because receiver is not assignable.
val res104 = names += "Ravi"
                   ^</pre>

</div>

</div>

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre>Compilation Failed</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [107]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">scala.collection.mutable.ListBuffer</span>
<span class="k">val</span> <span class="n">names1</span><span class="k">:</span><span class="kt">ListBuffer</span><span class="o">[</span><span class="kt">String</span><span class="o">]</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">ListBuffer</span><span class="o">()</span>
<span class="n">println</span><span class="o">(</span><span class="n">names1</span><span class="o">)</span>
<span class="n">names1</span> <span class="o">+=</span> <span class="s">"Ravi"</span>
<span class="n">println</span><span class="o">(</span><span class="n">names1</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>ListBuffer()
ListBuffer(Ravi)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[107]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.collection.mutable.ListBuffer</span> 
<span class="ansi-cyan-fg">names1</span>: <span class="ansi-green-fg">ListBuffer</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">ListBuffer</span>(<span class="ansi-green-fg">"Ravi"</span>)
<span class="ansi-cyan-fg">res106_3</span>: <span class="ansi-green-fg">ListBuffer</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">ListBuffer</span>(<span class="ansi-green-fg">"Ravi"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [108]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">states</span> <span class="k">=</span> <span class="nc">Map</span><span class="o">(</span><span class="s">"KA"</span> <span class="o">-></span> <span class="s">"Bangalore"</span><span class="o">,</span> <span class="s">"TN"</span> <span class="o">-></span> <span class="s">"Chennai"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">states</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Map(KA -> Bangalore, TN -> Chennai)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[108]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">states</span>: <span class="ansi-green-fg">Map</span>[<span class="ansi-green-fg">String</span>, <span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Map</span>(<span class="ansi-green-fg">"KA"</span> -> <span class="ansi-green-fg">"Bangalore"</span>, <span class="ansi-green-fg">"TN"</span> -> <span class="ansi-green-fg">"Chennai"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [108]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">states</span> <span class="o">+=</span> <span class="o">(</span><span class="s">"KL"</span> <span class="o">-></span> <span class="s">"Trivendram"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">states</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stderr output_text">

<pre>cmd108.sc:1: value += is not a member of scala.collection.immutable.Map[String,String]
  Expression does not convert to assignment because receiver is not assignable.
val res108_0 = states += ("KL" -> "Trivendram")
                      ^</pre>

</div>

</div>

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre>Compilation Failed</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [109]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">scala.collection.mutable.Map</span>

<span class="k">val</span> <span class="n">states</span> <span class="k">=</span> <span class="nc">Map</span><span class="o">(</span><span class="s">"KA"</span> <span class="o">-></span> <span class="s">"Bangalore"</span><span class="o">,</span> <span class="s">"TN"</span> <span class="o">-></span> <span class="s">"Chennai"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">states</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Map(TN -> Chennai, KA -> Bangalore)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[109]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.collection.mutable.Map</span> 
<span class="ansi-cyan-fg">states</span>: <span class="ansi-green-fg">collection</span>.<span class="ansi-green-fg">mutable</span>.<span class="ansi-green-fg">Map</span>[<span class="ansi-green-fg">String</span>, <span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Map</span>(<span class="ansi-green-fg">"TN"</span> -> <span class="ansi-green-fg">"Chennai"</span>, <span class="ansi-green-fg">"KA"</span> -> <span class="ansi-green-fg">"Bangalore"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [110]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">states</span> <span class="o">+=</span> <span class="o">(</span><span class="s">"KL"</span> <span class="o">-></span> <span class="s">"Trivendram"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">states</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Map(KL -> Trivendram, TN -> Chennai, KA -> Bangalore)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[110]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res109_0</span>: <span class="ansi-green-fg">Map</span>[<span class="ansi-green-fg">String</span>, <span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Map</span>(<span class="ansi-green-fg">"KL"</span> -> <span class="ansi-green-fg">"Trivendram"</span>, <span class="ansi-green-fg">"TN"</span> -> <span class="ansi-green-fg">"Chennai"</span>, <span class="ansi-green-fg">"KA"</span> -> <span class="ansi-green-fg">"Bangalore"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [111]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Tuples</span>

<span class="k">val</span> <span class="n">data</span> <span class="k">=</span> <span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">data</span><span class="o">)</span>
<span class="k">val</span> <span class="n">data1</span> <span class="k">=</span> <span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span> <span class="s">"naga"</span><span class="o">,</span> <span class="s">"siva"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">data1</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>(1,2,3)
(1,2,3,naga,siva)
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[111]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">data</span>: (<span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>) = (<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>)
<span class="ansi-cyan-fg">data1</span>: (<span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">String</span>, <span class="ansi-green-fg">String</span>) = (<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">"naga"</span>, <span class="ansi-green-fg">"siva"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [113]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Accessing Tuple elements</span>
<span class="n">println</span><span class="o">(</span><span class="n">data</span><span class="o">.</span><span class="n">_1</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">data1</span><span class="o">.</span><span class="n">_4</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>1
naga
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [115]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala File reads and Writes</span>
<span class="k">import</span> <span class="nn">scala.io.Source</span>

<span class="k">val</span> <span class="n">lines</span> <span class="k">=</span> <span class="nc">Source</span><span class="o">.</span><span class="n">fromFile</span><span class="o">(</span><span class="s">"/home/naga/bigdata/states"</span><span class="o">).</span><span class="n">getLines</span><span class="o">()</span>
<span class="k">for</span><span class="o">(</span><span class="n">line</span> <span class="k"><-</span> <span class="n">lines</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">line</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>bihar	patna	2
goa	panjim	4
karnataka	Bangalore	7
TN	chennai	9
Delhi	New Delhi	20
UP	Lucknow	11
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[115]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.io.Source</span> 
<span class="ansi-cyan-fg">lines</span>: <span class="ansi-green-fg">Iterator</span>[<span class="ansi-green-fg">String</span>] = empty iterator</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [116]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Option</span>
<span class="k">def</span> <span class="n">toInteger</span><span class="o">(</span><span class="n">num</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Option</span><span class="o">[</span><span class="kt">Int</span><span class="o">]</span> <span class="k">=</span> <span class="o">{</span>
    <span class="k">try</span><span class="o">{</span>
        <span class="nc">Some</span><span class="o">(</span><span class="n">num</span><span class="o">.</span><span class="n">toInt</span><span class="o">)</span>
    <span class="o">}</span><span class="k">catch</span><span class="o">{</span>
        <span class="k">case</span> <span class="n">nfe</span><span class="k">:</span> <span class="kt">NumberFormatException</span> <span class="o">=></span> <span class="nc">None</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[116]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">toInteger</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [117]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">number</span> <span class="k">=</span> <span class="n">toInteger</span><span class="o">(</span><span class="s">"100"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[117]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">number</span>: <span class="ansi-green-fg">Option</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Some</span>(<span class="ansi-green-fg">100</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [118]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">println</span><span class="o">(</span><span class="n">number</span><span class="o">.</span><span class="n">get</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>100
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [120]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="nc">Nan</span> <span class="k">=</span> <span class="n">toInteger</span><span class="o">(</span><span class="s">"ABC"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="nc">Nan</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>None
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[120]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">Nan</span>: <span class="ansi-green-fg">Option</span>[<span class="ansi-green-fg">Int</span>] = None</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [121]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Either</span>

<span class="k">def</span> <span class="n">validateName</span><span class="o">(</span><span class="n">name</span><span class="k">:</span> <span class="kt">String</span><span class="o">)</span><span class="k">:</span> <span class="kt">Either</span><span class="o">[</span><span class="kt">String</span>, <span class="kt">String</span><span class="o">]</span> <span class="k">=</span> <span class="o">{</span>
 <span class="k">if</span> <span class="o">(</span><span class="n">name</span><span class="o">.</span><span class="n">isEmpty</span><span class="o">)</span> <span class="nc">Left</span><span class="o">(</span><span class="s">"Name cannot be empty"</span><span class="o">)</span>
 <span class="k">else</span> <span class="nc">Right</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
 <span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[121]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">validateName</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [126]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">value</span> <span class="k">=</span> <span class="n">validateName</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="n">right</span><span class="o">.</span><span class="n">toOption</span><span class="o">.</span><span class="n">get</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Naga
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[126]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">value</span>: <span class="ansi-green-fg">Either</span>[<span class="ansi-green-fg">String</span>, <span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Right</span>(<span class="ansi-green-fg">"Naga"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [130]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">value</span> <span class="k">=</span> <span class="n">validateName</span><span class="o">(</span><span class="s">""</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="n">left</span><span class="o">.</span><span class="n">toOption</span><span class="o">.</span><span class="n">get</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Name cannot be empty
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[130]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">value</span>: <span class="ansi-green-fg">Either</span>[<span class="ansi-green-fg">String</span>, <span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Left</span>(<span class="ansi-green-fg">"Name cannot be empty"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [131]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Option</span>

<span class="k">def</span> <span class="n">validateName</span><span class="o">(</span><span class="n">name</span><span class="k">:</span> <span class="kt">String</span><span class="o">)</span><span class="k">:</span> <span class="kt">Option</span><span class="o">[</span><span class="kt">String</span><span class="o">]</span> <span class="k">=</span> <span class="o">{</span>
 <span class="k">if</span> <span class="o">(</span><span class="n">name</span><span class="o">.</span><span class="n">isEmpty</span><span class="o">)</span> <span class="nc">None</span>
 <span class="k">else</span> <span class="nc">Some</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[131]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">validateName</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [133]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">value</span> <span class="k">=</span> <span class="n">validateName</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="n">get</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Naga
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[133]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">value</span>: <span class="ansi-green-fg">Option</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Some</span>(<span class="ansi-green-fg">"Naga"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [134]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">value</span> <span class="k">=</span> <span class="n">validateName</span><span class="o">(</span><span class="s">""</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">value</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>None
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[134]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">value</span>: <span class="ansi-green-fg">Option</span>[<span class="ansi-green-fg">String</span>] = None</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [143]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">scala.util.Try</span>

<span class="k">def</span> <span class="n">divide</span><span class="o">(</span><span class="n">num</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Try</span><span class="o">[</span><span class="kt">Int</span><span class="o">]</span> <span class="k">=</span> <span class="o">{</span>
    <span class="k">val</span> <span class="n">data</span> <span class="k">=</span> <span class="nc">Try</span><span class="o">(</span><span class="mi">100</span> <span class="o">/</span> <span class="n">num</span><span class="o">)</span>
    <span class="o">(</span><span class="n">data</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[143]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.util.Try</span> 
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">divide</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [144]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">number</span> <span class="k">=</span> <span class="mi">10</span>
<span class="k">val</span> <span class="n">data</span> <span class="k">=</span> <span class="n">divide</span><span class="o">(</span><span class="n">number</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">data</span><span class="o">.</span><span class="n">toOption</span><span class="o">.</span><span class="n">get</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>10
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[144]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">number</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">10</span>
<span class="ansi-cyan-fg">data</span>: <span class="ansi-green-fg">Try</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Success</span>(<span class="ansi-green-fg">10</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [145]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">number</span> <span class="k">=</span> <span class="mi">0</span>
<span class="k">val</span> <span class="n">data</span> <span class="k">=</span> <span class="n">divide</span><span class="o">(</span><span class="n">number</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">data</span><span class="o">.</span><span class="n">toOption</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>None
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[145]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">number</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">0</span>
<span class="ansi-cyan-fg">data</span>: <span class="ansi-green-fg">Try</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Failure</span>(java.lang.ArithmeticException: / by zero)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [1]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">var</span> <span class="n">name</span> <span class="k">=</span> <span class="nc">Nil</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[1]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">Nil</span>.type = <span class="ansi-yellow-fg">List</span>()</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [2]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">events</span> <span class="k">=</span> <span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">5</span><span class="o">,</span><span class="s">"Hari"</span><span class="o">,</span> <span class="sc">'c'</span><span class="o">,</span> <span class="s">"ravi"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[2]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">events</span>: (<span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">Int</span>, <span class="ansi-green-fg">String</span>, <span class="ansi-green-fg">Char</span>, <span class="ansi-green-fg">String</span>) = (<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">"Hari"</span>, <span class="ansi-green-fg">'c'</span>, <span class="ansi-green-fg">"ravi"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [4]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">println</span><span class="o">(</span><span class="n">events</span><span class="o">.</span><span class="n">_6</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hari
</pre>

</div>

</div>

</div>

</div>

</div>

</div>

</div>
