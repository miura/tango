TANGO - Tools for Analysis of Nuclear Genome Organization
=========================================================

[TANGO](http://biophysique.mnhn.fr/tango) is an open-source software for
Analysis of Nuclear Genome Organization. It is composed of an ImageJ plugin
for batch processing and analysis, and a R package for statistical analysis.
It is currently being developed at the
[laboratory of Biophysics of the Museum National d'Histoire Naturelle](http://biophysique.mnhn.fr/).

Dependencies
------------

This package can be built automatically using Maven. However, a couple of
its dependencies are not yet available via a Maven repository. As a temporary
alternative, the following files must be present in `${basedir}/lib/`:

* [mcib3d-core.jar](http://sites.imagej.net/Tboudier/plugins/mcib3d-suite/mcib3d-core.jar-20140604140506)
* [mcib3d-plugins.jar](http://sites.imagej.net/Tboudier/plugins/mcib3d-suite/mcib3d_plugins.jar-20140604140506)
* JGR.jar extracted from the contents of [its R package](http://rforge.net/JGR/snapshot/JGR_1.7-17.tar.gz)
* javaDG.jar extracted from the contents of [its R package](http://www.rforge.net/JavaGD/snapshot/JavaGD_0.6-1.tar.gz)
* [JRI.jar](http://www.rforge.net/JRI/files/JRI.jar)
* [romanface-1.1.7.jar](https://romanface.googlecode.com/files/romanface-1.1.7.jar)
* [droplet_finder.jar](http://imagejdocu.tudor.lu/lib/exe/fetch.php?media=plugin:analysis:droplet_counter:droplet_finder.jar)

