select * from countries
right join regions
on countries.region_id=regions.region_id
where countries.country_name is  null;