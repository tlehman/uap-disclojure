# uap-disclojure 🛸

This [Clojure](https://clojure.org/) package is a set of tools for interacting with  OSINT (Open Source Intelligence) resources related to UAP/UFOs.

## Background

On 2023-07-14, the U.S. Senate introduced a new amendment to the NDAA (National Defense Authorization Act) that gives the government eminent domain over UAP material owned by private companies. Source: [senate.gov](https://www.democrats.senate.gov/newsroom/press-releases/schumer-rounds-introduce-new-legislation-to-declassify-government-records-related-to-unidentified-anomalous-phenomena-and-ufos_modeled-after-jfk-assassination-records-collection-act--as-an-amendment-to-ndaa)

> Additionally, the federal government shall have eminent domain over any and all recovered technologies of unknown origin (TUO) and biological evidence of non-human intelligence (NHI) that may be controlled by private persons or entities in the interests of the public good.


## Usage

Install [Leiningen](https://leiningen.org/) and run:

```
lein repl
```

Then to get started you can look at the `magonia` list of UAP sightings:

```clojure
(magonia)
[{"date" "7/1868", "desc" "A strange \"aerial construction\" bearing lights and making engine noises flew low over this town. Local people also described it as a giant bird covered with large scales producing a metallic noise. Although not an actual landing, this is the first instance of close observation of an unknown object at low altitude in the nineteenth cen
...
```

## License

Copyright © 2023 Tobi Lehman

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
