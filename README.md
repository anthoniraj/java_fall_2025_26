# Computer Programming: Java

* **Author**: `Anthoniraj Amalanathan`
* **Website**: [http://www.anthoniraj.in](http://www.anthoniraj.in)

## Microsoft OpenJDK 17 Installation

> Microsoft provides OpenJDK binaries for Java development on Windows, macOS, and Linux.

### Download

* Go to: [https://learn.microsoft.com/en-us/java/openjdk/download](https://learn.microsoft.com/en-us/java/openjdk/download)
* Choose **OpenJDK 17** for your operating system.
* Download the `.zip` or `.msi` installer (for Windows), or `.tar.gz` (for Linux/macOS).

### Installation (Windows - `.msi`)

1. Run the downloaded `.msi` file and follow the installation wizard.
2. Enable the checkbox **"Set JAVA\_HOME environment variable"** during installation.
3. After installation, verify Java setup using:

   ```bash
   java -version
   javac -version
   ```

## Installing Java in Visual Studio Code

To enable Java development in VS Code, install the official **Java Extension Pack**:

### Java Extension Pack Includes:

* Language support for Java™ by Red Hat
* Debugger for Java
* Java Test Runner
* Maven for Java
* IntelliCode

### Installation Steps:

1. Open **Visual Studio Code**
2. Go to **Extensions** panel (or press `Ctrl+Shift+X`)
3. Search for **Java Extension Pack**
4. Click **Install** on the pack published by Microsoft

**Marketplace Link**:
[Java Extension Pack - Visual Studio Marketplace](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

After installation, VS Code will prompt to create or open Java projects, and auto-configure build tools like Maven or Gradle if detected.

## Source Code and Lecture Notes

* Find Java source code by topic in the `src` folder
  Example: `edu.vit.corejava.basics` → Java language basics

* Browse the `lecture_notes` folder for class notes in `.md` (Markdown) format

## VSCode Extensions

* **Code Spell Checker**
  [Install](https://marketplace.visualstudio.com/items?itemName=streetsidesoftware.code-spell-checker)

* **FontSize Shortcuts** (for Ctrl++ / Ctrl--)
  [Install](https://marketplace.visualstudio.com/items?itemName=fosshaas.fontsize-shortcuts)


## VSCode Themes

* **Dobri Next - Themes and Icons**
  [Install](https://marketplace.visualstudio.com/items?itemName=sldobri.bunker)


## References

* [Oracle Java Coding Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html)
* [OCJP Certification Info](https://blogs.oracle.com/javamagazine/post/java-certification-exam-1z0-829)
* [Java Snippet Generator for VSCode](https://snippet-generator.app/)

