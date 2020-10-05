select * from countries
left join regions
on countries.region_id=regions.region_id
left  join locations
on locations.COUNTRY_ID=countries.country_id
where locations.state_province is null
;