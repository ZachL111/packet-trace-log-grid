# Review Journal

The cases below are the review handles I would use before changing the implementation.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 209, lane `ship`
- `stress`: `latency skew`, score 158, lane `ship`
- `edge`: `signal loss`, score 224, lane `ship`
- `recovery`: `incident shape`, score 205, lane `ship`
- `stale`: `span volume`, score 214, lane `ship`

## Note

The useful failure mode here is a wrong decision on a named case, not a vague style disagreement.
