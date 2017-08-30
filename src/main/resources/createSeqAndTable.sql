-- Sequence: public.seq_id
-- DROP TABLE public.record;
-- DROP SEQUENCE public.seq_id;

CREATE SEQUENCE public.seq_id
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;
ALTER TABLE public.seq_id
  OWNER TO postgres;


CREATE TABLE public.record
(
  id integer NOT NULL DEFAULT nextval('seq_id'::regclass),
  message character varying(400000)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.record
  OWNER TO postgres;
