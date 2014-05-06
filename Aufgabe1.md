Uebung2
=======
Allgemein
Eine Versionsverwaltung ist ein System, das zur Erfassung von Änderungen an Dokumenten oder Dateien verwendet wird. Alle Versionen werden in einem Archiv mit Zeitstempel und Benutzerkennung gesichert und können später wiederhergestellt werden. Versionsverwaltungssysteme werden typischerweise in der Softwareentwicklung eingesetzt, um Quelltexte zu verwalten.

Subversion
•	zentrales Repository
•	alle Änderungen werden an einem einzigen Ort gespeichert
•	wird eine Datei bearbeitet, so wird eine Kopie dieser Datei heruntergeladen und anschließend wieder hoch
•	bei gleichzeitigem Benutzen werden die Änderungen gemergt
  o	überschneiden sich diese, muss der Benutzer entscheiden

GIT
•	dezentral: jeder Benutzer besitzt lokale Kopie des gesamten Repositorys, inklusive Versionsgeschichte  daher können Änderung auch offline festgeschrieben werden
•	mit „push“ werden Änderungen hochgeladen
•	mit „pull“ wird das Repository auf den aktuellen Stand gebracht
Aufbau: Ein lokales Repository besteht aus drei Instanzen, die von GIT verwaltet werden. Die erste ist die Arbeitskopie, welche die echten Dateien enthält. Die zweite ist der Index, welcher als Zwischenstufe agiert und zu guter Letzt noch der HEAD, der auf den letzten Commit zeigt.
