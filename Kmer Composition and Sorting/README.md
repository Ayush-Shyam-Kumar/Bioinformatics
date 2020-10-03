# Kmer Composition

### What are Kmers ?

k-mer is a subsequent string of length 'K', in a given sequence of nucleotides. In context of bioinformatics the k-mer Composition of a given nucleotide or biological sequence, falls under the Computational Genomics and Sequence Analysis.

A genome is defined as, an organism’s complete set of genetic instructions. Each genome contains all of the information needed to build that organism and allow it to grow and develop. String of nucleotides present in a gene strings is called a Genome Sequence. Each of these sequence, produces a protein, for a specific functionality.

---

### Why do we need to find the Kmer Composition ?

We the kmer composition of a given biological sequence, to bring about any underlying property that it might hold; for instance the repetition of a k-mer in certain frequency could possibly be a biological message the governs some life process. Example :- Finding OriC in a given DNA sequence, were the DNA replication begins at the time of cell fission. 

The k-mer composition also extends in the study of computational approach for  sequence reconstruction, assuming we only have a set of kmers list. There are plenty well known algorithms for this purpose like Naïve, Hamiltonian and  De Bruijn approach utilizing computational properties of mathematical data structures like Graphs and Trees, applied in DNA sequence reconstruction.   

k-mers are capitalized upon to assemble DNA sequences, improve heterologous gene expression,identify species in metagenomic samples, and create attenuated vaccines.

Source : [k-mers Wikipedia](https://en.wikipedia.org/wiki/K-mer)  

---

### Algorithm

#### Kmer Composition
If the length of the given biological sequence is "L" and the required composition of k-mer is of length "k", then the total number of possible k-mers present in the sequence is given by :-          "L-k+1".

A window of length “k”, is slid over our original genome sequence for “(length of sequence)-k+1” time to attain all possible kmers in the sequence and stored in a list.



<img src="https://user-images.githubusercontent.com/65535504/94991050-fac2b200-059d-11eb-9bbd-6207965ba363.png" width="150" height="200">  

<img src="https://user-images.githubusercontent.com/65535504/94991116-660c8400-059e-11eb-9cf3-72c96ac75663.png" width="350" height="300 " align="Left">  
















<br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
#### Lexicographic Sorting
The obtained list is prioritized based on alphabetic order and rearranged in the list. The priority order in a DNA sequence is given by :-
<img src="https://user-images.githubusercontent.com/65535504/94992502-05824480-05a8-11eb-83c5-b1a82a8260a3.png" width="500" height="50">  
Priority Order : <br /><br /><br /><br />
<img src="https://user-images.githubusercontent.com/65535504/94992621-f5b73000-05a8-11eb-84b1-d983159c7d83.jpg" width="300" height="150" align="left">
<img src="https://user-images.githubusercontent.com/65535504/94992635-13849500-05a9-11eb-9969-f1582d76c48d.jpg" width="300" height="120" align="left"> 
<br /><br /><br /><br /><br /><br /><br />
<img src="https://user-images.githubusercontent.com/65535504/94992560-775a8e00-05a8-11eb-9e71-b4050f0d96d1.png" width="550" height="100" align="left">
