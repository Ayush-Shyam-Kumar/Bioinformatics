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

If the length of the given biological sequence is "L" and the required composition of k-mer is of length "k", then the total number of possible k-mers present in the sequence is given by :-          "L-k+1".

A window of length “k”, is slid over our original genome sequence for “(length of sequence)-k+1” time to attain all possible kmers in the sequence and stored in a list.



<img src="https://user-images.githubusercontent.com/65535504/94991050-fac2b200-059d-11eb-9bbd-6207965ba363.png" width="150" height="200">  



<img src="https://user-images.githubusercontent.com/65535504/94991116-660c8400-059e-11eb-9cf3-72c96ac75663.png" width="350" height="300 " align="Left">

