<div tabindex="-1" id="notebook" class="border-box-sizing">

<div class="container" id="notebook-container">

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [2]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"Naga"</span>
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

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span></pre>

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

<pre><span></span><span class="k">val</span> <span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=</span> <span class="nc">Pair</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">,</span> <span class="mi">40</span><span class="o">)</span>
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

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Hari"</span>
<span class="ansi-cyan-fg">age</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">40</span></pre>

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

<pre><span></span><span class="k">val</span> <span class="o">(</span><span class="n">name</span><span class="o">,</span> <span class="n">age</span><span class="o">)</span> <span class="k">=</span> <span class="nc">Pair</span><span class="o">(</span><span class="s">"Ravi"</span><span class="o">,</span> <span class="mi">30</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[4]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Ravi"</span>
<span class="ansi-cyan-fg">age</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">30</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [5]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Employee</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">role</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="o">{</span>
  <span class="k">val</span> <span class="k">this</span><span class="o">.</span><span class="n">name</span> <span class="k">=</span> <span class="n">name</span>
  <span class="k">val</span> <span class="k">this</span><span class="o">.</span><span class="n">age</span> <span class="k">=</span> <span class="n">age</span>
  <span class="k">val</span> <span class="k">this</span><span class="o">.</span><span class="n">role</span> <span class="k">=</span> <span class="n">role</span>
  <span class="k">def</span> <span class="n">getName</span><span class="o">()</span> <span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">return</span> <span class="n">name</span>
  <span class="o">}</span>
  <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">age</span><span class="o">)</span>
  <span class="o">}</span>
  <span class="k">def</span> <span class="n">getRole</span><span class="o">()</span><span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">role</span><span class="o">)</span>
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

<div class="prompt output_prompt">Out[5]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [6]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">,</span> <span class="mi">30</span><span class="o">,</span> <span class="s">"Architect"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getName</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getAge</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getRole</span><span class="o">)</span>
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
Architect
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[6]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">Employee</span> = $sess.cmd4Wrapper$Helper$Employee@811f0ce</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [7]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Manager</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">role</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">team</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">extends</span> <span class="nc">Employee</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">role</span><span class="k">:</span><span class="kt">String</span><span class="o">){</span>
    <span class="k">val</span> <span class="k">this</span><span class="o">.</span><span class="n">team</span> <span class="k">=</span> <span class="n">team</span>
    <span class="k">def</span> <span class="n">getTeam</span><span class="o">()</span> <span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
        <span class="k">return</span> <span class="n">team</span>
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

<div class="prompt output_prompt">Out[7]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Manager</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [8]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Manager</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">,</span> <span class="mi">30</span><span class="o">,</span> <span class="s">"Architect"</span><span class="o">,</span> <span class="s">"Hadoop"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getName</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getAge</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getRole</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getTeam</span><span class="o">)</span>
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
Architect
Hadoop
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[8]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">Manager</span> = $sess.cmd6Wrapper$Helper$Manager@2118b0e</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [11]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Employee</span> <span class="o">{</span>
   <span class="k">private</span> <span class="k">var</span> <span class="n">name</span><span class="k">:</span><span class="kt">String</span> <span class="o">=</span> <span class="kc">null</span>
   <span class="k">private</span> <span class="k">var</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="mi">0</span>
   <span class="k">private</span> <span class="k">var</span> <span class="n">place</span><span class="k">:</span><span class="kt">String</span> <span class="o">=</span> <span class="kc">null</span>

   <span class="k">def</span> <span class="n">setName</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">=</span> <span class="o">{</span>
    <span class="k">this</span><span class="o">.</span><span class="n">name</span> <span class="k">=</span> <span class="n">name</span>
   <span class="o">}</span>
   <span class="k">def</span> <span class="n">getName</span><span class="o">()</span><span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
       <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
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

<div class="prompt output_prompt">Out[11]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span></pre>

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

<pre><span></span><span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">()</span>
<span class="n">emp</span><span class="o">.</span><span class="n">setName</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">emp</span><span class="o">.</span><span class="n">getName</span><span class="o">)</span>
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

<div class="prompt output_prompt">Out[12]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">Employee</span> = $sess.cmd10Wrapper$Helper$Employee@7ba0cf6</pre>

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

<pre><span></span><span class="k">val</span> <span class="n">a</span> <span class="k">=</span> <span class="mi">10</span>
<span class="k">if</span><span class="o">(</span><span class="n">a</span> <span class="o"><</span> <span class="mi">20</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Hai"</span><span class="o">)</span>
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

<pre>Hai
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[13]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">a</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">10</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [14]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">a</span> <span class="k">=</span> <span class="mi">30</span>
<span class="k">if</span> <span class="o">(</span><span class="n">a</span> <span class="o"><</span> <span class="mi">20</span> <span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"hai"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Bye"</span><span class="o">)</span>
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

<pre>Bye
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[14]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">a</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">30</span></pre>

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

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">1</span> <span class="n">to</span> <span class="mi">10</span><span class="o">){</span>
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

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [16]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">1</span> <span class="n">until</span> <span class="mi">10</span><span class="o">){</span>
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

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [17]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="s">"ravi"</span><span class="o">,</span> <span class="s">"hari"</span><span class="o">,</span> <span class="s">"siva"</span><span class="o">,</span> <span class="s">"rajesh"</span><span class="o">)</span>
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

<pre>ravi
hari
siva
rajesh
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[17]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">"ravi"</span>, <span class="ansi-green-fg">"hari"</span>, <span class="ansi-green-fg">"siva"</span>, <span class="ansi-green-fg">"rajesh"</span>)</pre>

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

<pre><span></span><span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">5</span><span class="o">,</span><span class="mi">6</span><span class="o">,</span><span class="mi">7</span><span class="o">,</span><span class="mi">8</span><span class="o">,</span><span class="mi">9</span><span class="o">)</span>
<span class="k">val</span> <span class="n">even</span> <span class="k">=</span> <span class="k">for</span><span class="o">(</span><span class="n">num</span> <span class="k"><-</span> <span class="n">numbers</span> <span class="k">if</span> <span class="n">num</span> <span class="o">%</span> <span class="mi">2</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="k">yield</span> <span class="n">num</span>
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

<pre><span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">7</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">9</span>)
<span class="ansi-cyan-fg">even</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">8</span>)</pre>

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

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">num</span> <span class="k"><-</span> <span class="n">even</span><span class="o">){</span>
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

<pre>2
4
6
8
</pre>

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

<pre><span></span><span class="k">var</span> <span class="n">a</span> <span class="k">=</span> <span class="mi">0</span>
<span class="k">while</span><span class="o">(</span> <span class="n">a</span> <span class="o"><</span> <span class="mi">20</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">a</span><span class="o">)</span>
    <span class="n">a</span> <span class="k">=</span> <span class="n">a</span> <span class="o">+</span> <span class="mi">1</span>
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
10
11
12
13
14
15
16
17
18
19
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[20]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">a</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">20</span></pre>

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

<pre><span></span><span class="k">val</span> <span class="n">a</span> <span class="k">=</span> <span class="mi">20</span>
<span class="k">do</span> <span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="n">a</span><span class="o">)</span>
<span class="o">}</span><span class="k">while</span><span class="o">(</span><span class="n">a</span> <span class="o">></span> <span class="mi">20</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>20
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[21]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">a</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">20</span></pre>

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

<pre><span></span><span class="k">def</span> <span class="n">message</span><span class="o">(</span><span class="n">city</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">name</span> <span class="o">+</span> <span class="s">" welcome to "</span> <span class="o">+</span> <span class="n">city</span><span class="o">)</span>
<span class="o">}</span>
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

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">message</span></pre>

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

<pre><span></span><span class="c1">// Partially Applied Functions</span>
<span class="k">val</span> <span class="n">city</span> <span class="k">=</span> <span class="s">"Bangalore"</span>

<span class="k">var</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"Naga"</span>
<span class="n">message</span><span class="o">(</span><span class="n">city</span><span class="o">,</span> <span class="n">name</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Naga welcome to Bangalore
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[2]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">city</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Bangalore"</span>
<span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span></pre>

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

<pre><span></span><span class="k">val</span> <span class="n">messageBangalore</span> <span class="k">=</span> <span class="n">message</span><span class="o">(</span><span class="n">city</span><span class="o">,</span> <span class="k">_:</span><span class="kt">String</span><span class="o">)</span>
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

<pre><span class="ansi-cyan-fg">messageBangalore</span>: <span class="ansi-green-fg">String</span> => <span class="ansi-green-fg">Unit</span> = <function1></pre>

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

<pre><span></span><span class="n">messageBangalore</span><span class="o">(</span><span class="s">"Rajesh"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Rajesh welcome to Bangalore
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [5]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">messageBangalore</span><span class="o">(</span><span class="s">"Ravi"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Ravi welcome to Bangalore
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [6]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Recursive Functions</span>
<span class="k">def</span> <span class="n">fact</span><span class="o">(</span><span class="n">n</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">if</span><span class="o">(</span><span class="n">n</span> <span class="o"><</span> <span class="mi">1</span><span class="o">){</span>
        <span class="k">return</span> <span class="mi">1</span>
    <span class="o">}</span><span class="k">else</span><span class="o">{</span>
        <span class="k">return</span> <span class="n">n</span> <span class="o">*</span> <span class="n">fact</span><span class="o">(</span><span class="n">n</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span>
<span class="o">;</span>    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[6]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">fact</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [7]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">fact</span><span class="o">(</span><span class="mi">1</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[7]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res6</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">1</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [8]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">fact</span><span class="o">(</span><span class="mi">0</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[8]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res7</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">1</span></pre>

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

<pre><span></span><span class="n">fact</span><span class="o">(</span><span class="mi">10</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[9]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res8</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">3628800</span></pre>

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

<pre><span></span><span class="k">def</span> <span class="n">message</span><span class="o">(</span><span class="n">f</span><span class="k">:</span> <span class="kt">String</span> <span class="o">=></span> <span class="nc">String</span><span class="o">,</span> <span class="n">message</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">=</span> <span class="n">f</span><span class="o">(</span><span class="n">message</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[10]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">message</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [11]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">hai</span><span class="o">(</span><span class="n">msg</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">:</span><span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">return</span> <span class="s">"Hai this "</span> <span class="o">+</span> <span class="n">msg</span> <span class="o">+</span> <span class="s">" for you"</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[11]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">hai</span></pre>

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

<pre><span></span><span class="n">message</span><span class="o">(</span><span class="n">hai</span><span class="o">,</span> <span class="s">"message from President"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[12]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res11</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Hai this message from President for you"</span></pre>

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

<pre><span></span><span class="c1">// Anonymous Functions</span>
<span class="k">var</span> <span class="n">inc</span> <span class="k">=</span> <span class="o">(</span><span class="n">x</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=></span> <span class="n">x</span> <span class="o">+</span> <span class="mi">1</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[13]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">inc</span>: <span class="ansi-green-fg">Int</span> => <span class="ansi-green-fg">Int</span> = <function1></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [14]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">number</span> <span class="k">=</span> <span class="n">inc</span><span class="o">(</span><span class="mi">10</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[14]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">number</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">11</span></pre>

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

<pre><span></span><span class="k">def</span> <span class="n">mul</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">)(</span><span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)(</span><span class="n">c</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=</span> <span class="o">{</span>
    <span class="n">a</span> <span class="o">*</span> <span class="n">b</span> <span class="o">*</span> <span class="n">c</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[15]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">mul</span></pre>

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

<pre><span></span><span class="n">mul</span><span class="o">(</span><span class="mi">10</span><span class="o">)(</span><span class="mi">2</span><span class="o">)(</span><span class="mi">30</span><span class="o">)</span>
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

<pre><span class="ansi-cyan-fg">res15</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">600</span></pre>

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

<pre><span></span><span class="c1">//Scala Closure</span>
<span class="k">val</span> <span class="n">a</span> <span class="k">=</span> <span class="mi">20</span>
<span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="o">(</span><span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=></span> <span class="n">b</span> <span class="o">+</span> <span class="n">a</span>
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

<pre><span class="ansi-cyan-fg">a</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">20</span>
<span class="ansi-cyan-fg">sum</span>: <span class="ansi-green-fg">Int</span> => <span class="ansi-green-fg">Int</span> = <function1></pre>

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

<pre><span></span><span class="n">sum</span><span class="o">(</span><span class="mi">30</span><span class="o">)</span>
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

<pre><span class="ansi-cyan-fg">res17</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">50</span></pre>

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

<pre><span></span><span class="n">sum</span><span class="o">(</span><span class="mi">100</span><span class="o">)</span>
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

<pre><span class="ansi-cyan-fg">res18</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">120</span></pre>

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

<pre><span></span><span class="c1">//Scala Strings</span>

<span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"Naga"</span>
<span class="k">val</span> <span class="n">places</span> <span class="k">=</span> <span class="s">"""</span>
<span class="s">Bangalore</span>
<span class="s">Hyderabad</span>
<span class="s">Chennai</span>
<span class="s">Mumbai</span>
<span class="s">Vizag</span>
<span class="s">"""</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[20]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga"</span>
<span class="ansi-cyan-fg">places</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"""

Bangalore
Hyderabad
Chennai
Mumbai
Vizag

"""</span></pre>

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

<pre><span></span><span class="n">name</span><span class="o">.</span><span class="n">length</span>
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

<pre><span class="ansi-cyan-fg">res20</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">4</span></pre>

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

<pre><span></span><span class="k">val</span> <span class="n">surName</span> <span class="k">=</span> <span class="s">" I"</span>
<span class="n">name</span><span class="o">.</span><span class="n">concat</span><span class="o">(</span><span class="n">surName</span><span class="o">)</span>
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

<pre><span class="ansi-cyan-fg">surName</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">" I"</span>
<span class="ansi-cyan-fg">res22_1</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Naga I"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [24]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">println</span><span class="o">(</span><span class="s">s"The name is</span> <span class="si">$name</span><span class="s">"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>The name is Naga
</pre>

</div>

</div>

</div>

</div>

</div>

</div>

</div>
