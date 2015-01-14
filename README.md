# cookiecutter-finagle

The template includes a build.sbt including Finagle

## Generate a Project Skeleton

This is a cookiecutter template for Finagle applications. You need to install cookiecutter first. 

  <pre># pip install cookiecutter</pre>

<pre>
  $ cookiecutter https://github.com/jpzk/cookiecutter-finagle.git
  Cloning into 'cookiecutter-finagle'...
  remote: Counting objects: 32, done.
  remote: Compressing objects: 100% (25/25), done.
  remote: Total 32 (delta 12), reused 25 (delta 5)
  Unpacking objects: 100% (32/32), done.
  Checking connectivity... done.

  project_name (default is "My Finagle Application")? 
  app_name (default is "finagleapp")? 
  project_short_description (default is "A Finagle Application")? 
  jarfile (default is "finagleapp.jar")? 
  version (default is "0.0.1")? 
  scala_version (default is "2.10.4")? 
  org_package (default is "org.something")? 
  org_name (default is "Organization")? 
  org_website (default is "http://www.somesite.com")? 
</pre>
