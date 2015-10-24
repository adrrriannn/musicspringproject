package com.london.spring.transformer;

public interface Transformer<Entity, EntityDTO> {
	
	public EntityDTO Entity2EntityDTO(Entity entity);
	public Entity EntityDTO2Entity(EntityDTO entityDTO);
}
