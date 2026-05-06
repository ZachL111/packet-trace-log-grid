# packet-trace-log-grid

`packet-trace-log-grid` is a compact Scala repository for observability, centered on this goal: Package a Scala local lab for log analysis with transition tables, invalid-transition tests, and documented operating limits.

## Reason For The Project

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Packet Trace Log Grid Review Notes

The first comparison I would make is `signal loss` against `latency skew` because it shows where the rule is most opinionated.

## What It Does

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/packet-trace-log-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `signal loss` and `latency skew`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## How It Is Put Together

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Scala addition stays small enough to inspect in one sitting.

## Run It

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Check It

The verifier is intentionally local. It should fail if the fixture score math, lane assignment, or language-specific test drifts.

## Boundaries

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
